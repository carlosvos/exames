//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.05.14 às 12:29:57 AM BRT 
//


package br.com.cadastro.exames.integration;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.cadastro.exames.integration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.cadastro.exames.integration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExameResposta }
     * 
     */
    public ExameResposta createExameResposta() {
        return new ExameResposta();
    }

    /**
     * Create an instance of {@link Exame }
     * 
     */
    public Exame createExame() {
        return new Exame();
    }

    /**
     * Create an instance of {@link BuscaExameRequisicao }
     * 
     */
    public BuscaExameRequisicao createBuscaExameRequisicao() {
        return new BuscaExameRequisicao();
    }

}