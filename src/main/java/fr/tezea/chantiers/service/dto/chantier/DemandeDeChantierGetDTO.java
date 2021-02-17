/*
 * MIT License
 *
 * Copyright (c) 2021 TEZEA-Chantiers
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fr.tezea.chantiers.service.dto.chantier;

import fr.tezea.chantiers.domain.chantier.JourSemaineType;
import fr.tezea.chantiers.service.dto.client.ClientDTO;
import fr.tezea.chantiers.service.dto.site.SiteDTO;
import java.util.Date;
import java.util.Set;
import lombok.Data;

@Data
public class DemandeDeChantierGetDTO
{
    private long id;
    private SiteDTO site;
    private ClientDTO client;
    private int nombreEmployes;
    private String materiel;
    private String adresse;
    private String regularite;
    private int estimationTemps;
    private String particularite;
    private String description;
    private String informationsInterne;
    private Date dateDebutRegularite;
    private Date dateFinRegularite;
    private Set<JourSemaineType> joursRegularite;
}