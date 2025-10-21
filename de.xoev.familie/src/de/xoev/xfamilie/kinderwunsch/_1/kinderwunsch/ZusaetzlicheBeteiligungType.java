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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zusaetzliche Beteiligung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isZusaetzlicheBeteiligung <em>Zusaetzliche Beteiligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isVorliegenNachweis <em>Vorliegen Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZusaetzlicheBeteiligungType()
 * @model extendedMetaData="name='ZusaetzlicheBeteiligungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ZusaetzlicheBeteiligungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zusaetzliche Beteiligung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zusaetzliche Beteiligung</em>' attribute.
	 * @see #isSetZusaetzlicheBeteiligung()
	 * @see #unsetZusaetzlicheBeteiligung()
	 * @see #setZusaetzlicheBeteiligung(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZusaetzlicheBeteiligungType_ZusaetzlicheBeteiligung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zusaetzlicheBeteiligung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZusaetzlicheBeteiligung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isZusaetzlicheBeteiligung <em>Zusaetzliche Beteiligung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusaetzliche Beteiligung</em>' attribute.
	 * @see #isSetZusaetzlicheBeteiligung()
	 * @see #unsetZusaetzlicheBeteiligung()
	 * @see #isZusaetzlicheBeteiligung()
	 * @generated
	 */
	void setZusaetzlicheBeteiligung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isZusaetzlicheBeteiligung <em>Zusaetzliche Beteiligung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZusaetzlicheBeteiligung()
	 * @see #isZusaetzlicheBeteiligung()
	 * @see #setZusaetzlicheBeteiligung(boolean)
	 * @generated
	 */
	void unsetZusaetzlicheBeteiligung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isZusaetzlicheBeteiligung <em>Zusaetzliche Beteiligung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zusaetzliche Beteiligung</em>' attribute is set.
	 * @see #unsetZusaetzlicheBeteiligung()
	 * @see #isZusaetzlicheBeteiligung()
	 * @see #setZusaetzlicheBeteiligung(boolean)
	 * @generated
	 */
	boolean isSetZusaetzlicheBeteiligung();

	/**
	 * Returns the value of the '<em><b>Vorliegen Nachweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorliegen Nachweis</em>' attribute.
	 * @see #isSetVorliegenNachweis()
	 * @see #unsetVorliegenNachweis()
	 * @see #setVorliegenNachweis(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZusaetzlicheBeteiligungType_VorliegenNachweis()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='vorliegenNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVorliegenNachweis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isVorliegenNachweis <em>Vorliegen Nachweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorliegen Nachweis</em>' attribute.
	 * @see #isSetVorliegenNachweis()
	 * @see #unsetVorliegenNachweis()
	 * @see #isVorliegenNachweis()
	 * @generated
	 */
	void setVorliegenNachweis(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isVorliegenNachweis <em>Vorliegen Nachweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVorliegenNachweis()
	 * @see #isVorliegenNachweis()
	 * @see #setVorliegenNachweis(boolean)
	 * @generated
	 */
	void unsetVorliegenNachweis();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isVorliegenNachweis <em>Vorliegen Nachweis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vorliegen Nachweis</em>' attribute is set.
	 * @see #unsetVorliegenNachweis()
	 * @see #isVorliegenNachweis()
	 * @see #setVorliegenNachweis(boolean)
	 * @generated
	 */
	boolean isSetVorliegenNachweis();

	/**
	 * Returns the value of the '<em><b>Betrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Betrag</em>' attribute.
	 * @see #setBetrag(BigDecimal)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZusaetzlicheBeteiligungType_Betrag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='betrag' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getBetrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#getBetrag <em>Betrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betrag</em>' attribute.
	 * @see #getBetrag()
	 * @generated
	 */
	void setBetrag(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis</em>' containment reference.
	 * @see #setNachweis(NachweisdokumentType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZusaetzlicheBeteiligungType_Nachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getNachweis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#getNachweis <em>Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis</em>' containment reference.
	 * @see #getNachweis()
	 * @generated
	 */
	void setNachweis(NachweisdokumentType value);

} // ZusaetzlicheBeteiligungType
