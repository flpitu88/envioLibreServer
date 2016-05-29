/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author flpitu88
 */
@Configuration
@ComponentScan(basePackages = {"utn.enviolibre.services",
    "utn.enviolibre.repository"})
public class SpringConfig {

}
