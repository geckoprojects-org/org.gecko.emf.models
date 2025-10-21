/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elternteil Eins Elterngeldantrag Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum antragstellenden Elternteil.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getPersoenlicheAngaben <em>Persoenliche Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getGewoehnlicherAufenthalt <em>Gewoehnlicher Aufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKindschaftsverhaeltnis <em>Kindschaftsverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getHaushaltszugehoerigkeitDesKindes <em>Haushaltszugehoerigkeit Des Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getAlleinerziehendenanspruch <em>Alleinerziehendenanspruch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBeantragungElterngeld <em>Beantragung Elterngeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKrankenversicherung <em>Krankenversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getEinkommenVorGeburt <em>Einkommen Vor Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getEinkommenWaehrendBezugszeitraum <em>Einkommen Waehrend Bezugszeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBankverbindung <em>Bankverbindung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getZustimmungDatenabrufe <em>Zustimmung Datenabrufe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZustimmungAuskunftseinholungJobcenterArbeitsamt <em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKontaktmoeglichkeit <em>Kontaktmoeglichkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getSteuerlicheIdentifikationsnummer <em>Steuerliche Identifikationsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getNutzerkonto <em>Nutzerkonto</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getErwerbstaetigkeitBezugszeitraum <em>Erwerbstaetigkeit Bezugszeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBescheidzustellungVersandweg <em>Bescheidzustellung Versandweg</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getGesetzlicheVertretung <em>Gesetzliche Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getElternzeit <em>Elternzeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZusammenveranlagungLiegtVor <em>Zusammenveranlagung Liegt Vor</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getMitteilungAnBehoerde <em>Mitteilung An Behoerde</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType()
 * @model extendedMetaData="name='ElternteilEins.ElterngeldantragType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElternteilEinsElterngeldantragType extends EObject {
	/**
	 * Returns the value of the '<em><b>Persoenliche Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persoenliche Angaben</em>' containment reference.
	 * @see #setPersoenlicheAngaben(PersoenlicheAngabenETType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_PersoenlicheAngaben()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='persoenlicheAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	PersoenlicheAngabenETType getPersoenlicheAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getPersoenlicheAngaben <em>Persoenliche Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persoenliche Angaben</em>' containment reference.
	 * @see #getPersoenlicheAngaben()
	 * @generated
	 */
	void setPersoenlicheAngaben(PersoenlicheAngabenETType value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(AnschriftType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_Anschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	AnschriftType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(AnschriftType value);

	/**
	 * Returns the value of the '<em><b>Gewoehnlicher Aufenthalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gewoehnlicher Aufenthalt</em>' containment reference.
	 * @see #setGewoehnlicherAufenthalt(GewoehnlicherAufenthaltType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_GewoehnlicherAufenthalt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gewoehnlicherAufenthalt' namespace='##targetNamespace'"
	 * @generated
	 */
	GewoehnlicherAufenthaltType getGewoehnlicherAufenthalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getGewoehnlicherAufenthalt <em>Gewoehnlicher Aufenthalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gewoehnlicher Aufenthalt</em>' containment reference.
	 * @see #getGewoehnlicherAufenthalt()
	 * @generated
	 */
	void setGewoehnlicherAufenthalt(GewoehnlicherAufenthaltType value);

	/**
	 * Returns the value of the '<em><b>Kindschaftsverhaeltnis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kindschaftsverhaeltnis</em>' containment reference.
	 * @see #setKindschaftsverhaeltnis(KindschaftsverhaeltnisType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_Kindschaftsverhaeltnis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kindschaftsverhaeltnis' namespace='##targetNamespace'"
	 * @generated
	 */
	KindschaftsverhaeltnisType getKindschaftsverhaeltnis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKindschaftsverhaeltnis <em>Kindschaftsverhaeltnis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kindschaftsverhaeltnis</em>' containment reference.
	 * @see #getKindschaftsverhaeltnis()
	 * @generated
	 */
	void setKindschaftsverhaeltnis(KindschaftsverhaeltnisType value);

	/**
	 * Returns the value of the '<em><b>Haushaltszugehoerigkeit Des Kindes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Haushaltszugehörigkeit des Kindes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Haushaltszugehoerigkeit Des Kindes</em>' containment reference.
	 * @see #setHaushaltszugehoerigkeitDesKindes(HaushaltszugehoerigkeitDesKindesType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_HaushaltszugehoerigkeitDesKindes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='haushaltszugehoerigkeitDesKindes' namespace='##targetNamespace'"
	 * @generated
	 */
	HaushaltszugehoerigkeitDesKindesType getHaushaltszugehoerigkeitDesKindes();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getHaushaltszugehoerigkeitDesKindes <em>Haushaltszugehoerigkeit Des Kindes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Haushaltszugehoerigkeit Des Kindes</em>' containment reference.
	 * @see #getHaushaltszugehoerigkeitDesKindes()
	 * @generated
	 */
	void setHaushaltszugehoerigkeitDesKindes(HaushaltszugehoerigkeitDesKindesType value);

	/**
	 * Returns the value of the '<em><b>Alleinerziehendenanspruch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alleinerziehendenanspruch</em>' containment reference.
	 * @see #setAlleinerziehendenanspruch(AlleinerziehendenanspruchType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_Alleinerziehendenanspruch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alleinerziehendenanspruch' namespace='##targetNamespace'"
	 * @generated
	 */
	AlleinerziehendenanspruchType getAlleinerziehendenanspruch();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getAlleinerziehendenanspruch <em>Alleinerziehendenanspruch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alleinerziehendenanspruch</em>' containment reference.
	 * @see #getAlleinerziehendenanspruch()
	 * @generated
	 */
	void setAlleinerziehendenanspruch(AlleinerziehendenanspruchType value);

	/**
	 * Returns the value of the '<em><b>Beantragung Elterngeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ergänzende Anmerkungen zum Einkommen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beantragung Elterngeld</em>' containment reference.
	 * @see #setBeantragungElterngeld(BeantragungElterngeldType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_BeantragungElterngeld()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='beantragungElterngeld' namespace='##targetNamespace'"
	 * @generated
	 */
	BeantragungElterngeldType getBeantragungElterngeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBeantragungElterngeld <em>Beantragung Elterngeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beantragung Elterngeld</em>' containment reference.
	 * @see #getBeantragungElterngeld()
	 * @generated
	 */
	void setBeantragungElterngeld(BeantragungElterngeldType value);

	/**
	 * Returns the value of the '<em><b>Krankenversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Krankenversicherung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Krankenversicherung</em>' containment reference.
	 * @see #setKrankenversicherung(KrankenversicherungType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_Krankenversicherung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='krankenversicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	KrankenversicherungType getKrankenversicherung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKrankenversicherung <em>Krankenversicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Krankenversicherung</em>' containment reference.
	 * @see #getKrankenversicherung()
	 * @generated
	 */
	void setKrankenversicherung(KrankenversicherungType value);

	/**
	 * Returns the value of the '<em><b>Einkommen Vor Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Einkommen des antragstellenden Elternteils vor Geburt des Kindes. Dieses Element ist optional, da es im Zusammenhang mit der Berechnung des Elterngeldes steht. Wenn Elterngeld individuell auf Basis des Erwerbseinkommens im Bemessungszeitraum berechnet wird, dann müssen die Daten für Einkommen vor Geburt angegeben werden. Wenn der Pauschalbetrag (Mindestbeitrag 300€) für das Elterngeld angesetzt wird, müssen keine Daten für Einkommen vor Geburt angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommen Vor Geburt</em>' containment reference.
	 * @see #setEinkommenVorGeburt(EinkommenVorGeburtType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_EinkommenVorGeburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='einkommenVorGeburt' namespace='##targetNamespace'"
	 * @generated
	 */
	EinkommenVorGeburtType getEinkommenVorGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getEinkommenVorGeburt <em>Einkommen Vor Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommen Vor Geburt</em>' containment reference.
	 * @see #getEinkommenVorGeburt()
	 * @generated
	 */
	void setEinkommenVorGeburt(EinkommenVorGeburtType value);

	/**
	 * Returns the value of the '<em><b>Einkommen Waehrend Bezugszeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Einkommen des antragstellenden Elternteils im Bezugszeitraum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommen Waehrend Bezugszeitraum</em>' containment reference.
	 * @see #setEinkommenWaehrendBezugszeitraum(EinkommenWaehrendBezugszeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_EinkommenWaehrendBezugszeitraum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='einkommenWaehrendBezugszeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EinkommenWaehrendBezugszeitraumType getEinkommenWaehrendBezugszeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getEinkommenWaehrendBezugszeitraum <em>Einkommen Waehrend Bezugszeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommen Waehrend Bezugszeitraum</em>' containment reference.
	 * @see #getEinkommenWaehrendBezugszeitraum()
	 * @generated
	 */
	void setEinkommenWaehrendBezugszeitraum(EinkommenWaehrendBezugszeitraumType value);

	/**
	 * Returns the value of the '<em><b>Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Bankverbindung Hinweis: Antragsfälle ohne Bankverbindung werden durch XFamilie in der aktuellen Fassung nicht unterstützt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bankverbindung</em>' containment reference.
	 * @see #setBankverbindung(BankverbindungInhaberOptionalType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_Bankverbindung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bankverbindung' namespace='##targetNamespace'"
	 * @generated
	 */
	BankverbindungInhaberOptionalType getBankverbindung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBankverbindung <em>Bankverbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bankverbindung</em>' containment reference.
	 * @see #getBankverbindung()
	 * @generated
	 */
	void setBankverbindung(BankverbindungInhaberOptionalType value);

	/**
	 * Returns the value of the '<em><b>Zustimmung Datenabrufe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zustimmung Datenabrufe</em>' containment reference.
	 * @see #setZustimmungDatenabrufe(ZustimmungDatenabrufeType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_ZustimmungDatenabrufe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zustimmungDatenabrufe' namespace='##targetNamespace'"
	 * @generated
	 */
	ZustimmungDatenabrufeType getZustimmungDatenabrufe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getZustimmungDatenabrufe <em>Zustimmung Datenabrufe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Datenabrufe</em>' containment reference.
	 * @see #getZustimmungDatenabrufe()
	 * @generated
	 */
	void setZustimmungDatenabrufe(ZustimmungDatenabrufeType value);

	/**
	 * Returns the value of the '<em><b>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>' attribute.
	 * @see #isSetZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @see #unsetZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @see #setZustimmungAuskunftseinholungJobcenterArbeitsamt(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_ZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zustimmungAuskunftseinholungJobcenterArbeitsamt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungAuskunftseinholungJobcenterArbeitsamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZustimmungAuskunftseinholungJobcenterArbeitsamt <em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>' attribute.
	 * @see #isSetZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @see #unsetZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @see #isZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @generated
	 */
	void setZustimmungAuskunftseinholungJobcenterArbeitsamt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZustimmungAuskunftseinholungJobcenterArbeitsamt <em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @see #isZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @see #setZustimmungAuskunftseinholungJobcenterArbeitsamt(boolean)
	 * @generated
	 */
	void unsetZustimmungAuskunftseinholungJobcenterArbeitsamt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZustimmungAuskunftseinholungJobcenterArbeitsamt <em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>' attribute is set.
	 * @see #unsetZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @see #isZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @see #setZustimmungAuskunftseinholungJobcenterArbeitsamt(boolean)
	 * @generated
	 */
	boolean isSetZustimmungAuskunftseinholungJobcenterArbeitsamt();

	/**
	 * Returns the value of the '<em><b>Kontaktmoeglichkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kontaktmoeglichkeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_Kontaktmoeglichkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kontaktmoeglichkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErreichbarkeitType> getKontaktmoeglichkeit();

	/**
	 * Returns the value of the '<em><b>Steuerliche Identifikationsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die steuerliche Identifikationsnummer des antragstellenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steuerliche Identifikationsnummer</em>' attribute.
	 * @see #setSteuerlicheIdentifikationsnummer(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_SteuerlicheIdentifikationsnummer()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.SteuerlicheIdentifikationsnummerType" required="true"
	 *        extendedMetaData="kind='element' name='steuerlicheIdentifikationsnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSteuerlicheIdentifikationsnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getSteuerlicheIdentifikationsnummer <em>Steuerliche Identifikationsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steuerliche Identifikationsnummer</em>' attribute.
	 * @see #getSteuerlicheIdentifikationsnummer()
	 * @generated
	 */
	void setSteuerlicheIdentifikationsnummer(String value);

	/**
	 * Returns the value of the '<em><b>Nutzerkonto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum verwendeten Nutzerkonto.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nutzerkonto</em>' containment reference.
	 * @see #setNutzerkonto(NutzerkontoType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_Nutzerkonto()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nutzerkonto' namespace='##targetNamespace'"
	 * @generated
	 */
	NutzerkontoType getNutzerkonto();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getNutzerkonto <em>Nutzerkonto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutzerkonto</em>' containment reference.
	 * @see #getNutzerkonto()
	 * @generated
	 */
	void setNutzerkonto(NutzerkontoType value);

	/**
	 * Returns the value of the '<em><b>Erwerbstaetigkeit Bezugszeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die antragstellende Person im Bezugszeitraum einer beruflichen Tätigkeit nachgeht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erwerbstaetigkeit Bezugszeitraum</em>' containment reference.
	 * @see #setErwerbstaetigkeitBezugszeitraum(ErwerbstaetigkeitBezugszeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_ErwerbstaetigkeitBezugszeitraum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='erwerbstaetigkeitBezugszeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	ErwerbstaetigkeitBezugszeitraumType getErwerbstaetigkeitBezugszeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getErwerbstaetigkeitBezugszeitraum <em>Erwerbstaetigkeit Bezugszeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erwerbstaetigkeit Bezugszeitraum</em>' containment reference.
	 * @see #getErwerbstaetigkeitBezugszeitraum()
	 * @generated
	 */
	void setErwerbstaetigkeitBezugszeitraum(ErwerbstaetigkeitBezugszeitraumType value);

	/**
	 * Returns the value of the '<em><b>Bescheidzustellung Versandweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Versandweg für den Bescheid zum Elterngeldantrag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bescheidzustellung Versandweg</em>' containment reference.
	 * @see #setBescheidzustellungVersandweg(CodeVersandwegType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_BescheidzustellungVersandweg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bescheidzustellungVersandweg' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeVersandwegType getBescheidzustellungVersandweg();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBescheidzustellungVersandweg <em>Bescheidzustellung Versandweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bescheidzustellung Versandweg</em>' containment reference.
	 * @see #getBescheidzustellungVersandweg()
	 * @generated
	 */
	void setBescheidzustellungVersandweg(CodeVersandwegType value);

	/**
	 * Returns the value of the '<em><b>Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur gesetzlichen Vertretung, z.B. bei minderjährigen Antragstellenden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gesetzliche Vertretung</em>' containment reference.
	 * @see #setGesetzlicheVertretung(GesetzlicheVertretungType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_GesetzlicheVertretung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gesetzlicheVertretung' namespace='##targetNamespace'"
	 * @generated
	 */
	GesetzlicheVertretungType getGesetzlicheVertretung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getGesetzlicheVertretung <em>Gesetzliche Vertretung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gesetzliche Vertretung</em>' containment reference.
	 * @see #getGesetzlicheVertretung()
	 * @generated
	 */
	void setGesetzlicheVertretung(GesetzlicheVertretungType value);

	/**
	 * Returns the value of the '<em><b>Elternzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elternzeit</em>' containment reference.
	 * @see #setElternzeit(ElternzeitType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_Elternzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='elternzeit' namespace='##targetNamespace'"
	 * @generated
	 */
	ElternzeitType getElternzeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getElternzeit <em>Elternzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elternzeit</em>' containment reference.
	 * @see #getElternzeit()
	 * @generated
	 */
	void setElternzeit(ElternzeitType value);

	/**
	 * Returns the value of the '<em><b>Zusammenveranlagung Liegt Vor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wenn eine steuerliche Zusammenveranlagung mit Ja beantwortet wird, muss die Elterngeldstelle eine zusätzliche Einwilligung des Partners einholen. Bei einem Nein kann der Datenabruf ohne zusätzliche Einwilligung erfolgen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusammenveranlagung Liegt Vor</em>' attribute.
	 * @see #isSetZusammenveranlagungLiegtVor()
	 * @see #unsetZusammenveranlagungLiegtVor()
	 * @see #setZusammenveranlagungLiegtVor(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_ZusammenveranlagungLiegtVor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zusammenveranlagungLiegtVor' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZusammenveranlagungLiegtVor();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZusammenveranlagungLiegtVor <em>Zusammenveranlagung Liegt Vor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusammenveranlagung Liegt Vor</em>' attribute.
	 * @see #isSetZusammenveranlagungLiegtVor()
	 * @see #unsetZusammenveranlagungLiegtVor()
	 * @see #isZusammenveranlagungLiegtVor()
	 * @generated
	 */
	void setZusammenveranlagungLiegtVor(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZusammenveranlagungLiegtVor <em>Zusammenveranlagung Liegt Vor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZusammenveranlagungLiegtVor()
	 * @see #isZusammenveranlagungLiegtVor()
	 * @see #setZusammenveranlagungLiegtVor(boolean)
	 * @generated
	 */
	void unsetZusammenveranlagungLiegtVor();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZusammenveranlagungLiegtVor <em>Zusammenveranlagung Liegt Vor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zusammenveranlagung Liegt Vor</em>' attribute is set.
	 * @see #unsetZusammenveranlagungLiegtVor()
	 * @see #isZusammenveranlagungLiegtVor()
	 * @see #setZusammenveranlagungLiegtVor(boolean)
	 * @generated
	 */
	boolean isSetZusammenveranlagungLiegtVor();

	/**
	 * Returns the value of the '<em><b>Mitteilung An Behoerde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mitteilungen an die Behörde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitteilung An Behoerde</em>' attribute.
	 * @see #setMitteilungAnBehoerde(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternteilEinsElterngeldantragType_MitteilungAnBehoerde()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='mitteilungAnBehoerde' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMitteilungAnBehoerde();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getMitteilungAnBehoerde <em>Mitteilung An Behoerde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitteilung An Behoerde</em>' attribute.
	 * @see #getMitteilungAnBehoerde()
	 * @generated
	 */
	void setMitteilungAnBehoerde(String value);

} // ElternteilEinsElterngeldantragType
