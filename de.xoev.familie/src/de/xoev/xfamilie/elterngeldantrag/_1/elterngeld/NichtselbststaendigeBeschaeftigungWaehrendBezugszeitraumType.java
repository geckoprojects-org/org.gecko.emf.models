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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nichtselbststaendige Beschaeftigung Waehrend Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zur voraussichtlichennichtselbstständigen Beschäftigung des antragstellenden Elternteils im Bezugszeitraum.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isTeilzeittaetigkeit <em>Teilzeittaetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getAngabenTeilzeittaetigkeit <em>Angaben Teilzeittaetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMidijob <em>Midijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getAngabenMidijob <em>Angaben Midijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMinijob <em>Minijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getAngabenMinijob <em>Angaben Minijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getBerufsausbildung <em>Berufsausbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getFreiwilligendienst <em>Freiwilligendienst</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
 * @model extendedMetaData="name='NichtselbststaendigeBeschaeftigung.WaehrendBezugszeitraumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Teilzeittaetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob voraussichtlich Einkommen aus einer selbständigen Beschäftigung im Bezugszeitraum erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teilzeittaetigkeit</em>' attribute.
	 * @see #isSetTeilzeittaetigkeit()
	 * @see #unsetTeilzeittaetigkeit()
	 * @see #setTeilzeittaetigkeit(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Teilzeittaetigkeit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='teilzeittaetigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isTeilzeittaetigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isTeilzeittaetigkeit <em>Teilzeittaetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teilzeittaetigkeit</em>' attribute.
	 * @see #isSetTeilzeittaetigkeit()
	 * @see #unsetTeilzeittaetigkeit()
	 * @see #isTeilzeittaetigkeit()
	 * @generated
	 */
	void setTeilzeittaetigkeit(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isTeilzeittaetigkeit <em>Teilzeittaetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTeilzeittaetigkeit()
	 * @see #isTeilzeittaetigkeit()
	 * @see #setTeilzeittaetigkeit(boolean)
	 * @generated
	 */
	void unsetTeilzeittaetigkeit();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isTeilzeittaetigkeit <em>Teilzeittaetigkeit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Teilzeittaetigkeit</em>' attribute is set.
	 * @see #unsetTeilzeittaetigkeit()
	 * @see #isTeilzeittaetigkeit()
	 * @see #setTeilzeittaetigkeit(boolean)
	 * @generated
	 */
	boolean isSetTeilzeittaetigkeit();

	/**
	 * Returns the value of the '<em><b>Angaben Teilzeittaetigkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angaben Teilzeittaetigkeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_AngabenTeilzeittaetigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenTeilzeittaetigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TeilzeittaetigkeitType> getAngabenTeilzeittaetigkeit();

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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Midijob()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='midijob' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMidijob();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMidijob <em>Midijob</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMidijob <em>Midijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMidijob()
	 * @see #isMidijob()
	 * @see #setMidijob(boolean)
	 * @generated
	 */
	void unsetMidijob();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMidijob <em>Midijob</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Angaben Midijob</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Midijob.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Midijob</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_AngabenMidijob()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenMidijob' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MidijobType> getAngabenMidijob();

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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Minijob()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='minijob' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMinijob();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMinijob <em>Minijob</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMinijob <em>Minijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinijob()
	 * @see #isMinijob()
	 * @see #setMinijob(boolean)
	 * @generated
	 */
	void unsetMinijob();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMinijob <em>Minijob</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Angaben Minijob</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angaben Minijob</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_AngabenMinijob()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenMinijob' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MinijobType> getAngabenMinijob();

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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Steuerfreibetrag()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='steuerfreibetrag' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSteuerfreibetrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteuerfreibetrag()
	 * @see #isSteuerfreibetrag()
	 * @see #setSteuerfreibetrag(boolean)
	 * @generated
	 */
	void unsetSteuerfreibetrag();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Berufsausbildung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Berufsausbildung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Berufsausbildung</em>' containment reference.
	 * @see #setBerufsausbildung(BerufsausbildungType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Berufsausbildung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='berufsausbildung' namespace='##targetNamespace'"
	 * @generated
	 */
	BerufsausbildungType getBerufsausbildung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getBerufsausbildung <em>Berufsausbildung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Berufsausbildung</em>' containment reference.
	 * @see #getBerufsausbildung()
	 * @generated
	 */
	void setBerufsausbildung(BerufsausbildungType value);

	/**
	 * Returns the value of the '<em><b>Freiwilligendienst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Freiwilligendienst
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freiwilligendienst</em>' containment reference.
	 * @see #setFreiwilligendienst(FreiwilligendienstType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Freiwilligendienst()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='freiwilligendienst' namespace='##targetNamespace'"
	 * @generated
	 */
	FreiwilligendienstType getFreiwilligendienst();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getFreiwilligendienst <em>Freiwilligendienst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freiwilligendienst</em>' containment reference.
	 * @see #getFreiwilligendienst()
	 * @generated
	 */
	void setFreiwilligendienst(FreiwilligendienstType value);

} // NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType
