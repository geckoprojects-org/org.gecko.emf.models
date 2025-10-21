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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nichtselbststaendige Beschaeftigung Vor Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zur abhängigen Beschäftigung des antragstellenden Elternteils vor Geburt des Kindes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#getNichtselbststaendigkeitAusklammerungstatbestaende <em>Nichtselbststaendigkeit Ausklammerungstatbestaende</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isBerufsbildung <em>Berufsbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMidijob <em>Midijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMinijob <em>Minijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isFreiwilligendienst <em>Freiwilligendienst</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungVorGeburtType()
 * @model extendedMetaData="name='NichtselbststaendigeBeschaeftigung.VorGeburtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NichtselbststaendigeBeschaeftigungVorGeburtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nichtselbststaendigkeit Ausklammerungstatbestaende</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Art des Einkommens, das voraussichtlich im Bemessungszeitraum erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nichtselbststaendigkeit Ausklammerungstatbestaende</em>' containment reference.
	 * @see #setNichtselbststaendigkeitAusklammerungstatbestaende(NichtselbststaendigkeitAusklammerungstatbestaendeType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungVorGeburtType_NichtselbststaendigkeitAusklammerungstatbestaende()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nichtselbststaendigkeitAusklammerungstatbestaende' namespace='##targetNamespace'"
	 * @generated
	 */
	NichtselbststaendigkeitAusklammerungstatbestaendeType getNichtselbststaendigkeitAusklammerungstatbestaende();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#getNichtselbststaendigkeitAusklammerungstatbestaende <em>Nichtselbststaendigkeit Ausklammerungstatbestaende</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nichtselbststaendigkeit Ausklammerungstatbestaende</em>' containment reference.
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaende()
	 * @generated
	 */
	void setNichtselbststaendigkeitAusklammerungstatbestaende(NichtselbststaendigkeitAusklammerungstatbestaendeType value);

	/**
	 * Returns the value of the '<em><b>Berufsbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Berufsausbildung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Berufsbildung</em>' attribute.
	 * @see #isSetBerufsbildung()
	 * @see #unsetBerufsbildung()
	 * @see #setBerufsbildung(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungVorGeburtType_Berufsbildung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='berufsbildung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBerufsbildung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isBerufsbildung <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Berufsbildung</em>' attribute.
	 * @see #isSetBerufsbildung()
	 * @see #unsetBerufsbildung()
	 * @see #isBerufsbildung()
	 * @generated
	 */
	void setBerufsbildung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isBerufsbildung <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBerufsbildung()
	 * @see #isBerufsbildung()
	 * @see #setBerufsbildung(boolean)
	 * @generated
	 */
	void unsetBerufsbildung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isBerufsbildung <em>Berufsbildung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Berufsbildung</em>' attribute is set.
	 * @see #unsetBerufsbildung()
	 * @see #isBerufsbildung()
	 * @see #setBerufsbildung(boolean)
	 * @generated
	 */
	boolean isSetBerufsbildung();

	/**
	 * Returns the value of the '<em><b>Midijob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu Midijobs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Midijob</em>' attribute.
	 * @see #isSetMidijob()
	 * @see #unsetMidijob()
	 * @see #setMidijob(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungVorGeburtType_Midijob()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='midijob' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMidijob();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMidijob <em>Midijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midijob</em>' attribute.
	 * @see #isSetMidijob()
	 * @see #unsetMidijob()
	 * @see #isMidijob()
	 * @generated
	 */
	void setMidijob(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMidijob <em>Midijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMidijob()
	 * @see #isMidijob()
	 * @see #setMidijob(boolean)
	 * @generated
	 */
	void unsetMidijob();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMidijob <em>Midijob</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Midijob</em>' attribute is set.
	 * @see #unsetMidijob()
	 * @see #isMidijob()
	 * @see #setMidijob(boolean)
	 * @generated
	 */
	boolean isSetMidijob();

	/**
	 * Returns the value of the '<em><b>Steuerfreibetrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Steuerfreibetrag nach Paragraf 3 Nr. 26 EStG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steuerfreibetrag</em>' attribute.
	 * @see #isSetSteuerfreibetrag()
	 * @see #unsetSteuerfreibetrag()
	 * @see #setSteuerfreibetrag(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungVorGeburtType_Steuerfreibetrag()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='steuerfreibetrag' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSteuerfreibetrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steuerfreibetrag</em>' attribute.
	 * @see #isSetSteuerfreibetrag()
	 * @see #unsetSteuerfreibetrag()
	 * @see #isSteuerfreibetrag()
	 * @generated
	 */
	void setSteuerfreibetrag(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteuerfreibetrag()
	 * @see #isSteuerfreibetrag()
	 * @see #setSteuerfreibetrag(boolean)
	 * @generated
	 */
	void unsetSteuerfreibetrag();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steuerfreibetrag</em>' attribute is set.
	 * @see #unsetSteuerfreibetrag()
	 * @see #isSteuerfreibetrag()
	 * @see #setSteuerfreibetrag(boolean)
	 * @generated
	 */
	boolean isSetSteuerfreibetrag();

	/**
	 * Returns the value of the '<em><b>Minijob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu Minijobs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minijob</em>' attribute.
	 * @see #isSetMinijob()
	 * @see #unsetMinijob()
	 * @see #setMinijob(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungVorGeburtType_Minijob()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='minijob' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMinijob();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMinijob <em>Minijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minijob</em>' attribute.
	 * @see #isSetMinijob()
	 * @see #unsetMinijob()
	 * @see #isMinijob()
	 * @generated
	 */
	void setMinijob(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMinijob <em>Minijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinijob()
	 * @see #isMinijob()
	 * @see #setMinijob(boolean)
	 * @generated
	 */
	void unsetMinijob();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMinijob <em>Minijob</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minijob</em>' attribute is set.
	 * @see #unsetMinijob()
	 * @see #isMinijob()
	 * @see #setMinijob(boolean)
	 * @generated
	 */
	boolean isSetMinijob();

	/**
	 * Returns the value of the '<em><b>Freiwilligendienst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Freiwilligendienst
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freiwilligendienst</em>' attribute.
	 * @see #isSetFreiwilligendienst()
	 * @see #unsetFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungVorGeburtType_Freiwilligendienst()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='freiwilligendienst' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFreiwilligendienst();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFreiwilligendienst()
	 * @see #isFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @generated
	 */
	void unsetFreiwilligendienst();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Freiwilligendienst</em>' attribute is set.
	 * @see #unsetFreiwilligendienst()
	 * @see #isFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @generated
	 */
	boolean isSetFreiwilligendienst();

} // NichtselbststaendigeBeschaeftigungVorGeburtType
