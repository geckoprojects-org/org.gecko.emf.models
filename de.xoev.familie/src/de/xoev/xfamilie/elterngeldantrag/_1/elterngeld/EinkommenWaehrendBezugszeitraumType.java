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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einkommen Waehrend Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Einkommen des antragstellenden Elternteils nach Geburt des Kindes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getNichtselbststaendigeBeschaeftigung <em>Nichtselbststaendige Beschaeftigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isGewerbebetrieb <em>Gewerbebetrieb</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft <em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isBeruecksichtigungBetriebsausgaben <em>Beruecksichtigung Betriebsausgaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getNachweisBetriebsausgaben <em>Nachweis Betriebsausgaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getEinkommensersatzleistungenBezugszeitraum <em>Einkommensersatzleistungen Bezugszeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getArbeitgeberformblatt <em>Arbeitgeberformblatt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isFreiwilligendienst <em>Freiwilligendienst</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType()
 * @model extendedMetaData="name='Einkommen.WaehrendBezugszeitraumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinkommenWaehrendBezugszeitraumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nichtselbststaendige Beschaeftigung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur abhängigen Beschäftigung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nichtselbststaendige Beschaeftigung</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_NichtselbststaendigeBeschaeftigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nichtselbststaendigeBeschaeftigung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType> getNichtselbststaendigeBeschaeftigung();

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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_SelbstaendigeBeschaeftigung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='selbstaendigeBeschaeftigung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSelbstaendigeBeschaeftigung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelbstaendigeBeschaeftigung()
	 * @see #isSelbstaendigeBeschaeftigung()
	 * @see #setSelbstaendigeBeschaeftigung(boolean)
	 * @generated
	 */
	void unsetSelbstaendigeBeschaeftigung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}' attribute is set.
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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_LandUndForstwirtschaft()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='landUndForstwirtschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLandUndForstwirtschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLandUndForstwirtschaft()
	 * @see #isLandUndForstwirtschaft()
	 * @see #setLandUndForstwirtschaft(boolean)
	 * @generated
	 */
	void unsetLandUndForstwirtschaft();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Gewerbebetrieb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob voraussichtlich Einkommen aus einer Tätigkeit in einem Gewerbebetrieb im Bezugszeitraum erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gewerbebetrieb</em>' attribute.
	 * @see #isSetGewerbebetrieb()
	 * @see #unsetGewerbebetrieb()
	 * @see #setGewerbebetrieb(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_Gewerbebetrieb()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='gewerbebetrieb' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGewerbebetrieb();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isGewerbebetrieb <em>Gewerbebetrieb</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isGewerbebetrieb <em>Gewerbebetrieb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGewerbebetrieb()
	 * @see #isGewerbebetrieb()
	 * @see #setGewerbebetrieb(boolean)
	 * @generated
	 */
	void unsetGewerbebetrieb();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isGewerbebetrieb <em>Gewerbebetrieb</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>' containment reference.
	 * @see #setEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft(EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft <em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>' containment reference.
	 * @see #getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft()
	 * @generated
	 */
	void setEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft(EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType value);

	/**
	 * Returns the value of the '<em><b>Beruecksichtigung Betriebsausgaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe zur Berücksichtigung der Betriebsausgaben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beruecksichtigung Betriebsausgaben</em>' attribute.
	 * @see #isSetBeruecksichtigungBetriebsausgaben()
	 * @see #unsetBeruecksichtigungBetriebsausgaben()
	 * @see #setBeruecksichtigungBetriebsausgaben(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_BeruecksichtigungBetriebsausgaben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='beruecksichtigungBetriebsausgaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBeruecksichtigungBetriebsausgaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isBeruecksichtigungBetriebsausgaben <em>Beruecksichtigung Betriebsausgaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beruecksichtigung Betriebsausgaben</em>' attribute.
	 * @see #isSetBeruecksichtigungBetriebsausgaben()
	 * @see #unsetBeruecksichtigungBetriebsausgaben()
	 * @see #isBeruecksichtigungBetriebsausgaben()
	 * @generated
	 */
	void setBeruecksichtigungBetriebsausgaben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isBeruecksichtigungBetriebsausgaben <em>Beruecksichtigung Betriebsausgaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBeruecksichtigungBetriebsausgaben()
	 * @see #isBeruecksichtigungBetriebsausgaben()
	 * @see #setBeruecksichtigungBetriebsausgaben(boolean)
	 * @generated
	 */
	void unsetBeruecksichtigungBetriebsausgaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isBeruecksichtigungBetriebsausgaben <em>Beruecksichtigung Betriebsausgaben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Beruecksichtigung Betriebsausgaben</em>' attribute is set.
	 * @see #unsetBeruecksichtigungBetriebsausgaben()
	 * @see #isBeruecksichtigungBetriebsausgaben()
	 * @see #setBeruecksichtigungBetriebsausgaben(boolean)
	 * @generated
	 */
	boolean isSetBeruecksichtigungBetriebsausgaben();

	/**
	 * Returns the value of the '<em><b>Nachweis Betriebsausgaben</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Nachweis über die Betriebsausgaben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Betriebsausgaben</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_NachweisBetriebsausgaben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisBetriebsausgaben' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisBetriebsausgaben();

	/**
	 * Returns the value of the '<em><b>Einkommensersatzleistungen Bezugszeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu Einkommensersatzleistungen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommensersatzleistungen Bezugszeitraum</em>' containment reference.
	 * @see #setEinkommensersatzleistungenBezugszeitraum(EinkommensersatzleistungenBezugszeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_EinkommensersatzleistungenBezugszeitraum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='einkommensersatzleistungenBezugszeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EinkommensersatzleistungenBezugszeitraumType getEinkommensersatzleistungenBezugszeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getEinkommensersatzleistungenBezugszeitraum <em>Einkommensersatzleistungen Bezugszeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommensersatzleistungen Bezugszeitraum</em>' containment reference.
	 * @see #getEinkommensersatzleistungenBezugszeitraum()
	 * @generated
	 */
	void setEinkommensersatzleistungenBezugszeitraum(EinkommensersatzleistungenBezugszeitraumType value);

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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_EinkommenAusNichtselbststaendigerTaetigkeit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='einkommenAusNichtselbststaendigerTaetigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinkommenAusNichtselbststaendigerTaetigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #isEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #setEinkommenAusNichtselbststaendigerTaetigkeit(boolean)
	 * @generated
	 */
	void unsetEinkommenAusNichtselbststaendigerTaetigkeit();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Arbeitgeberformblatt</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Arbeitgeberformblatt kann hier hochgeladen werden, um die Höhe und Dauer der Sachbezüge nachzuweisen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arbeitgeberformblatt</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_Arbeitgeberformblatt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arbeitgeberformblatt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getArbeitgeberformblatt();

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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommenWaehrendBezugszeitraumType_Freiwilligendienst()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='freiwilligendienst' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFreiwilligendienst();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFreiwilligendienst()
	 * @see #isFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @generated
	 */
	void unsetFreiwilligendienst();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Freiwilligendienst</em>' attribute is set.
	 * @see #unsetFreiwilligendienst()
	 * @see #isFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @generated
	 */
	boolean isSetFreiwilligendienst();

} // EinkommenWaehrendBezugszeitraumType
