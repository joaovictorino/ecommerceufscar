/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.bean;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author João Henrique
 */
public class CompraBeanTest {

    public CompraBeanTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of efetuarCompra method, of class CompraBean.
     */
    @Test
    public void efetuarCompra() {
        System.out.println("efetuarCompra");
        String login_cli = "jh_vs";
        Map<Integer, Integer> mapProdutos = new HashMap<Integer, Integer>();
        mapProdutos.put(1, 1);
        CompraBean instance = new CompraBean();
        boolean expResult = true;
        boolean result = instance.efetuarCompra(login_cli, mapProdutos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}