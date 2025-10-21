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

import de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einkommen Vor Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Einkommen des antragstellenden Elternteils vor Geburt des Kindes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getNichtselbststaendigeBeschaeftigung <em>Nichtselbststaendige Beschaeftigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig <em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getGeringesEinkommenCovid19 <em>Geringes Einkommen Covid19</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getEntgeltdatenDsrv <em>Entgeltdaten Dsrv</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isGewerbebetrieb <em>Gewerbebetrieb</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isFreiwilligendienst <em>Freiwilligendienst</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getNachweisMutter <em>Nachweis Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getSelbststaendigkeitGewerbeLandForstwirtschaft <em>Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getEinkommensersatzleistungen <em>Einkommensersatzleistungen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType()
 * @model extendedMetaData="name='Einkommen.VorGeburtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinkommenVorGeburtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nichtselbststaendige Beschaeftigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur abhängigen Beschäftigung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nichtselbststaendige Beschaeftigung</em>' containment reference.
	 * @see #setNichtselbststaendigeBeschaeftigung(NichtselbststaendigeBeschaeftigungVorGeburtType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_NichtselbststaendigeBeschaeftigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nichtselbststaendigeBeschaeftigung' namespace='##targetNamespace'"
	 * @generated
	 */
	NichtselbststaendigeBeschaeftigungVorGeburtType getNichtselbststaendigeBeschaeftigung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getNichtselbststaendigeBeschaeftigung <em>Nichtselbststaendige Beschaeftigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nichtselbststaendige Beschaeftigung</em>' containment reference.
	 * @see #getNichtselbststaendigeBeschaeftigung()
	 * @generated
	 */
	void setNichtselbststaendigeBeschaeftigung(NichtselbststaendigeBeschaeftigungVorGeburtType value);

	/**
	 * Returns the value of the '<em><b>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hatten Sie im letzten und aktuellen steuerlichen Veranlagungszeitraum aus selbstständiger Arbeit jeweils einen Gewinn von weniger als 35,00 €
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>' attribute.
	 * @see #isSetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @see #unsetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @see #setBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_BeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='beruecksichtigungAusschliesslichEinkommenNichtselbststaendig' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig <em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>' attribute.
	 * @see #isSetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @see #unsetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @see #isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @generated
	 */
	void setBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig <em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @see #isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @see #setBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig(boolean)
	 * @generated
	 */
	void unsetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig <em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>' attribute is set.
	 * @see #unsetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @see #isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @see #setBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig(boolean)
	 * @generated
	 */
	boolean isSetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig();

	/**
	 * Returns the value of the '<em><b>Einkommen Aus Nichtselbststaendiger Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe zum Einkommen aus einer nichtselbstständigen Beschäftigung, beispielsweise Lohn, Gehalt, auch aus einem Mini-Job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>' attribute.
	 * @see #isSetEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #unsetEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #setEinkommenAusNichtselbststaendigerTaetigkeit(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_EinkommenAusNichtselbststaendigerTaetigkeit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='einkommenAusNichtselbststaendigerTaetigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinkommenAusNichtselbststaendigerTaetigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>' attribute.
	 * @see #isSetEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #unsetEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #isEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @generated
	 */
	void setEinkommenAusNichtselbststaendigerTaetigkeit(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #isEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #setEinkommenAusNichtselbststaendigerTaetigkeit(boolean)
	 * @generated
	 */
	void unsetEinkommenAusNichtselbststaendigerTaetigkeit();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>' attribute is set.
	 * @see #unsetEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #isEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #setEinkommenAusNichtselbststaendigerTaetigkeit(boolean)
	 * @generated
	 */
	boolean isSetEinkommenAusNichtselbststaendigerTaetigkeit();

	/**
	 * Returns the value of the '<em><b>Selbstaendige Beschaeftigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob voraussichtlich Einkommen aus einer selbständigen Beschäftigung im Bezugszeitraum erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selbstaendige Beschaeftigung</em>' attribute.
	 * @see #isSetSelbstaendigeBeschaeftigung()
	 * @see #unsetSelbstaendigeBeschaeftigung()
	 * @see #setSelbstaendigeBeschaeftigung(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_SelbstaendigeBeschaeftigung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='selbstaendigeBeschaeftigung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSelbstaendigeBeschaeftigung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selbstaendige Beschaeftigung</em>' attribute.
	 * @see #isSetSelbstaendigeBeschaeftigung()
	 * @see #unsetSelbstaendigeBeschaeftigung()
	 * @see #isSelbstaendigeBeschaeftigung()
	 * @generated
	 */
	void setSelbstaendigeBeschaeftigung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelbstaendigeBeschaeftigung()
	 * @see #isSelbstaendigeBeschaeftigung()
	 * @see #setSelbstaendigeBeschaeftigung(boolean)
	 * @generated
	 */
	void unsetSelbstaendigeBeschaeftigung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Selbstaendige Beschaeftigung</em>' attribute is set.
	 * @see #unsetSelbstaendigeBeschaeftigung()
	 * @see #isSelbstaendigeBeschaeftigung()
	 * @see #setSelbstaendigeBeschaeftigung(boolean)
	 * @generated
	 */
	boolean isSetSelbstaendigeBeschaeftigung();

	/**
	 * Returns the value of the '<em><b>Geringes Einkommen Covid19</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geringes Einkommen Covid19</em>' containment reference.
	 * @see #setGeringesEinkommenCovid19(GeringesEinkommenCovid19Type)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_GeringesEinkommenCovid19()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geringesEinkommenCovid19' namespace='##targetNamespace'"
	 * @generated
	 */
	GeringesEinkommenCovid19Type getGeringesEinkommenCovid19();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getGeringesEinkommenCovid19 <em>Geringes Einkommen Covid19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geringes Einkommen Covid19</em>' containment reference.
	 * @see #getGeringesEinkommenCovid19()
	 * @generated
	 */
	void setGeringesEinkommenCovid19(GeringesEinkommenCovid19Type value);

	/**
	 * Returns the value of the '<em><b>Entgeltdaten Dsrv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entgeltdaten Dsrv</em>' containment reference.
	 * @see #setEntgeltdatenDsrv(EntgeltdatenDsrvNachweisbezugType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_EntgeltdatenDsrv()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entgeltdaten.dsrv' namespace='##targetNamespace'"
	 * @generated
	 */
	EntgeltdatenDsrvNachweisbezugType getEntgeltdatenDsrv();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getEntgeltdatenDsrv <em>Entgeltdaten Dsrv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entgeltdaten Dsrv</em>' containment reference.
	 * @see #getEntgeltdatenDsrv()
	 * @generated
	 */
	void setEntgeltdatenDsrv(EntgeltdatenDsrvNachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Gewerbebetrieb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob voraussichtlich Einkommen aus einer Tätigkeit in einem Gewerbebetrieb erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gewerbebetrieb</em>' attribute.
	 * @see #isSetGewerbebetrieb()
	 * @see #unsetGewerbebetrieb()
	 * @see #setGewerbebetrieb(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_Gewerbebetrieb()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='gewerbebetrieb' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGewerbebetrieb();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isGewerbebetrieb <em>Gewerbebetrieb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gewerbebetrieb</em>' attribute.
	 * @see #isSetGewerbebetrieb()
	 * @see #unsetGewerbebetrieb()
	 * @see #isGewerbebetrieb()
	 * @generated
	 */
	void setGewerbebetrieb(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isGewerbebetrieb <em>Gewerbebetrieb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGewerbebetrieb()
	 * @see #isGewerbebetrieb()
	 * @see #setGewerbebetrieb(boolean)
	 * @generated
	 */
	void unsetGewerbebetrieb();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isGewerbebetrieb <em>Gewerbebetrieb</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gewerbebetrieb</em>' attribute is set.
	 * @see #unsetGewerbebetrieb()
	 * @see #isGewerbebetrieb()
	 * @see #setGewerbebetrieb(boolean)
	 * @generated
	 */
	boolean isSetGewerbebetrieb();

	/**
	 * Returns the value of the '<em><b>Land Und Forstwirtschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob voraussichtlich Einkommen aus einer Tätigkeit in der Land- und Forstwirtschaft im Bezugszeitraum erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Land Und Forstwirtschaft</em>' attribute.
	 * @see #isSetLandUndForstwirtschaft()
	 * @see #unsetLandUndForstwirtschaft()
	 * @see #setLandUndForstwirtschaft(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_LandUndForstwirtschaft()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='landUndForstwirtschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLandUndForstwirtschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Land Und Forstwirtschaft</em>' attribute.
	 * @see #isSetLandUndForstwirtschaft()
	 * @see #unsetLandUndForstwirtschaft()
	 * @see #isLandUndForstwirtschaft()
	 * @generated
	 */
	void setLandUndForstwirtschaft(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLandUndForstwirtschaft()
	 * @see #isLandUndForstwirtschaft()
	 * @see #setLandUndForstwirtschaft(boolean)
	 * @generated
	 */
	void unsetLandUndForstwirtschaft();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Land Und Forstwirtschaft</em>' attribute is set.
	 * @see #unsetLandUndForstwirtschaft()
	 * @see #isLandUndForstwirtschaft()
	 * @see #setLandUndForstwirtschaft(boolean)
	 * @generated
	 */
	boolean isSetLandUndForstwirtschaft();

	/**
	 * Returns the value of the '<em><b>Freiwilligendienst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die antragstellende Person einem Freiwilligendienst nachgeht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freiwilligendienst</em>' attribute.
	 * @see #isSetFreiwilligendienst()
	 * @see #unsetFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_Freiwilligendienst()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='freiwilligendienst' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFreiwilligendienst();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freiwilligendienst</em>' attribute.
	 * @see #isSetFreiwilligendienst()
	 * @see #unsetFreiwilligendienst()
	 * @see #isFreiwilligendienst()
	 * @generated
	 */
	void setFreiwilligendienst(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFreiwilligendienst()
	 * @see #isFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @generated
	 */
	void unsetFreiwilligendienst();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Freiwilligendienst</em>' attribute is set.
	 * @see #unsetFreiwilligendienst()
	 * @see #isFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @generated
	 */
	boolean isSetFreiwilligendienst();

	/**
	 * Returns the value of the '<em><b>Nachweis Mutter</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier können Nachweise zu Mutterschutz und Mutterschaftsgeld hochgeladen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Mutter</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_NachweisMutter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisMutter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisMutter();

	/**
	 * Returns the value of the '<em><b>Selbststaendigkeit Gewerbe Land Forstwirtschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob voraussichtlich Einkommen aus einer selbständigen Beschäftigung erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>' containment reference.
	 * @see #setSelbststaendigkeitGewerbeLandForstwirtschaft(SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_SelbststaendigkeitGewerbeLandForstwirtschaft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='selbststaendigkeitGewerbeLandForstwirtschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType getSelbststaendigkeitGewerbeLandForstwirtschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getSelbststaendigkeitGewerbeLandForstwirtschaft <em>Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>' containment reference.
	 * @see #getSelbststaendigkeitGewerbeLandForstwirtschaft()
	 * @generated
	 */
	void setSelbststaendigkeitGewerbeLandForstwirtschaft(SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType value);

	/**
	 * Returns the value of the '<em><b>Einkommensersatzleistungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu Einkommensersatzleistungen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommensersatzleistungen</em>' containment reference.
	 * @see #setEinkommensersatzleistungen(EinkommensersatzleistungenVorGeburtType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenVorGeburtType_Einkommensersatzleistungen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='einkommensersatzleistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EinkommensersatzleistungenVorGeburtType getEinkommensersatzleistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getEinkommensersatzleistungen <em>Einkommensersatzleistungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommensersatzleistungen</em>' containment reference.
	 * @see #getEinkommensersatzleistungen()
	 * @generated
	 */
	void setEinkommensersatzleistungen(EinkommensersatzleistungenVorGeburtType value);

} // EinkommenVorGeburtType
