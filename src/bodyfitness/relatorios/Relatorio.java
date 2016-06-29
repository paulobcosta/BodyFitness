/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.relatorios;

import bodyfitness.dao.ClienteDAO;
import bodyfitness.dao.EquipamentoDAO;
import bodyfitness.equipamentos.Equipamento;
import bodyfitness.pessoas.cliente.Cliente;
import bodyfitness.pessoas.cliente.caracteristicas.corporal.CondicionamentoFisico;
import bodyfitness.pessoas.cliente.treino.Treino;
import java.io.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author batista
 */
public class Relatorio {

    public void GeraRelatorioAdimplente(String caminho) {
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(caminho + "/Adimplentes.pdf"));
            documento.open();
            ClienteDAO dao = new ClienteDAO();
            List<Cliente> clientes = dao.consultarAdimplentes();
            PdfPTable tabela = new PdfPTable(2);
            tabela.addCell("ID");
            tabela.addCell("Nome");
            Paragraph p = new Paragraph("     Relatório - Clientes Adimplentes\n\n\n");
            documento.add(p);
            for (Cliente c : clientes) {
                tabela.addCell(c.getId().toString());
                tabela.addCell(c.getNome());
            }
            documento.add(tabela);
            documento.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar documento:\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void GeraRelatorioInadimplente(String caminho) {
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(caminho + "/Adimplentes.pdf"));
            documento.open();
            ClienteDAO dao = new ClienteDAO();
            List<Cliente> clientes = dao.consultarInadimplentes();
            PdfPTable tabela = new PdfPTable(2);
            tabela.addCell("ID");
            tabela.addCell("Nome");
            Paragraph p = new Paragraph("     Relatório - Clientes Inadimplentes\n\n\n");
            documento.add(p);
            for (Cliente c : clientes) {
                tabela.addCell(c.getId().toString());
                tabela.addCell(c.getNome());
            }
            documento.add(tabela);
            documento.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar documento:\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void GeraRelatorioMaquinaSManutencao(String caminho) {
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(caminho + "/MaquinaSManutencao.pdf"));
            documento.open();
            EquipamentoDAO dao = new EquipamentoDAO();
            List<Equipamento> equips = dao.consultarSemManutancao();
            PdfPTable tabela = new PdfPTable(3);
            tabela.addCell("ID");
            tabela.addCell("Nome");
            tabela.addCell("D. Ultima Mantencao");
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Paragraph p = new Paragraph("     Relatório - Clientes Máquinas Sem Manutenção\n\n\n");
            documento.add(p);
            for (Equipamento e : equips) {
                tabela.addCell(e.getId().toString());
                tabela.addCell(e.getNome());
                tabela.addCell(formato.format(e.getDataDaUltimaManutencao()));
            }
            documento.add(tabela);
            documento.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar documento:\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void GeraRelatorioTreino(String caminho, Long id) {
        ClienteDAO cdao = new ClienteDAO();
        Cliente cliente = cdao.consultarPorId(id);
        Document documento = new Document();
        Paragraph p = new Paragraph("Nome: " + cliente.getNome() + "\n" + "Id: " + cliente.getId().toString()
                + "\n" + "Idade: " + cliente.getIdade().toString() + "\n\n");
        PdfPTable tabela = new PdfPTable(3);
        tabela.addCell("Maquina");
        tabela.addCell("Séries");
        tabela.addCell("Repetições");
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(caminho + "/MaquinaSManutencao.pdf"));
            Treino t = cliente.getTreino();
            for (int i = 0; i < t.getSeries().size(); i++) {
                tabela.addCell(t.getSeries().get(i).getEquipamento().getNome());
                tabela.addCell(String.valueOf(t.getSeries().get(i).getQuantidadeDeSeries()));
                tabela.addCell(String.valueOf(t.getSeries().get(i).getRepeticoes()));
            }
            documento.add(p);
            documento.add(tabela);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em relatório de treino:\n" + e.getMessage());
        } finally {
            documento.close();
        }

    }

    public void GeraRelatorioCondFisico(String caminho, Long id) {
        Document documento = new Document();
        ClienteDAO cdao = new ClienteDAO();
        Cliente c = cdao.consultarPorId(id);
        Paragraph p = new Paragraph("Nome: " + c.getNome() + "\n" + "Id: " + c.getId().toString()
                + "\n" + "Idade: " + c.getIdade().toString() + "\n\n");
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(caminho + "/CondFisico.pdf"));
            documento.open();
            PdfPTable tabela = new PdfPTable(2);
            tabela.addCell("Aspecto");
            tabela.addCell("Valor");

            //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            CondicionamentoFisico cf = c.getCondicionamentoFisico();
            tabela.addCell("IMC");
            tabela.addCell(cf.getComposicaoCorporal().getImc().toString());
            tabela.addCell("Massa Gorda");
            tabela.addCell(cf.getComposicaoCorporal().getMassaGorda().toString());
            tabela.addCell("Massa Magra");
            tabela.addCell(cf.getComposicaoCorporal().getMassaMagra().toString());
            tabela.addCell("Percentual atual de gordura");
            tabela.addCell(cf.getComposicaoCorporal().getPercentualGorduraAtual().toString());
            tabela.addCell("Percentual ideal de gordura");
            tabela.addCell(cf.getComposicaoCorporal().getPercentualGorduraIdeal().toString());
            tabela.addCell("Abdominal");
            tabela.addCell(cf.getDobrasCutaneas().getAbdominal().toString());
            tabela.addCell("Axilar Media");
            tabela.addCell(cf.getDobrasCutaneas().getAxilarMedia().toString());
            tabela.addCell("Bicipital");
            tabela.addCell(cf.getDobrasCutaneas().getBicipital().toString());
            tabela.addCell("Coxa");
            tabela.addCell(cf.getDobrasCutaneas().getCoxa().toString());
            tabela.addCell("Panturrilha");
            tabela.addCell(cf.getDobrasCutaneas().getPanturrilha().toString());
            tabela.addCell("Peitoral");
            tabela.addCell(cf.getDobrasCutaneas().getPeitoral().toString());
            tabela.addCell("Subescapular");
            tabela.addCell(cf.getDobrasCutaneas().getSubescapular().toString());
            tabela.addCell("Supra iliaca");
            tabela.addCell(cf.getDobrasCutaneas().getSupraIliaca().toString());
            tabela.addCell("Tricipital");
            tabela.addCell(cf.getDobrasCutaneas().getTricipital().toString());
            tabela.addCell("Antebraço Direito");
            tabela.addCell(cf.getMembrosInferiores().getAnteBracoDireito().toString());
            tabela.addCell("Braço Contraído Direito");
            tabela.addCell(cf.getMembrosInferiores().getBracoContraidoDireito().toString());
            tabela.addCell("Braço Relaxado Direito");
            tabela.addCell(cf.getMembrosInferiores().getBracoRelaxadoDireito().toString());
            tabela.addCell("Braço Relaxado Esquerdo");
            tabela.addCell(cf.getMembrosInferiores().getBracoRelaxadoEsquerdo().toString());
            tabela.addCell("Coxa Esquerda");
            tabela.addCell(cf.getMembrosInferiores().getCoxaEsquerdo().toString());
            tabela.addCell("Panturrilha Direita");
            tabela.addCell(cf.getMembrosInferiores().getPanturrilhaDireito().toString());
            tabela.addCell("Abdome");
            tabela.addCell(cf.getMembrosSuperiores().getAbdome().toString());
            tabela.addCell("Cintura");
            tabela.addCell(cf.getMembrosSuperiores().getCintura().toString());
            tabela.addCell("Ombro");
            tabela.addCell(cf.getMembrosSuperiores().getOmbro().toString());
            tabela.addCell("Pescoço");
            tabela.addCell(cf.getMembrosSuperiores().getPescoco().toString());
            tabela.addCell("Quadril");
            tabela.addCell(cf.getMembrosSuperiores().getQuadril().toString());
            tabela.addCell("Toráx");
            tabela.addCell(cf.getMembrosSuperiores().getToraxRelaxado().toString());
            documento.add(p);

            documento.add(tabela);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar documento:\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            documento.close();
        }
    }

}
