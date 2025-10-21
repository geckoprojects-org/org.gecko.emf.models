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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auslaendisches Arbeitsverhaeltnis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnis <em>Auslaendisches Arbeitsverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#getBeschaeftigungsland <em>Beschaeftigungsland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnisAndererET <em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslaendischesArbeitsverhaeltnisType()
 * @model extendedMetaData="name='AuslaendischesArbeitsverhaeltnisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AuslaendischesArbeitsverhaeltnisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Auslaendisches Arbeitsverhaeltnis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arbeiten Sie in Deutschland (nicht-selbstständig oder selbstständig) oder haben Sie einen Arbeitsvertrag nach deutschem Recht?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auslaendisches Arbeitsverhaeltnis</em>' attribute.
	 * @see #isSetAuslaendischesArbeitsverhaeltnis()
	 * @see #unsetAuslaendischesArbeitsverhaeltnis()
	 * @see #setAuslaendischesArbeitsverhaeltnis(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslaendischesArbeitsverhaeltnisType_AuslaendischesArbeitsverhaeltnis()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='auslaendischesArbeitsverhaeltnis' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAuslaendischesArbeitsverhaeltnis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnis <em>Auslaendisches Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auslaendisches Arbeitsverhaeltnis</em>' attribute.
	 * @see #isSetAuslaendischesArbeitsverhaeltnis()
	 * @see #unsetAuslaendischesArbeitsverhaeltnis()
	 * @see #isAuslaendischesArbeitsverhaeltnis()
	 * @generated
	 */
	void setAuslaendischesArbeitsverhaeltnis(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnis <em>Auslaendisches Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuslaendischesArbeitsverhaeltnis()
	 * @see #isAuslaendischesArbeitsverhaeltnis()
	 * @see #setAuslaendischesArbeitsverhaeltnis(boolean)
	 * @generated
	 */
	void unsetAuslaendischesArbeitsverhaeltnis();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnis <em>Auslaendisches Arbeitsverhaeltnis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auslaendisches Arbeitsverhaeltnis</em>' attribute is set.
	 * @see #unsetAuslaendischesArbeitsverhaeltnis()
	 * @see #isAuslaendischesArbeitsverhaeltnis()
	 * @see #setAuslaendischesArbeitsverhaeltnis(boolean)
	 * @generated
	 */
	boolean isSetAuslaendischesArbeitsverhaeltnis();

	/**
	 * Returns the value of the '<em><b>Beschaeftigungsland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beschaeftigungsland</em>' containment reference.
	 * @see #setBeschaeftigungsland(CodeStaatType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslaendischesArbeitsverhaeltnisType_Beschaeftigungsland()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beschaeftigungsland' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStaatType getBeschaeftigungsland();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#getBeschaeftigungsland <em>Beschaeftigungsland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschaeftigungsland</em>' containment reference.
	 * @see #getBeschaeftigungsland()
	 * @generated
	 */
	void setBeschaeftigungsland(CodeStaatType value);

	/**
	 * Returns the value of the '<em><b>Auslaendisches Arbeitsverhaeltnis Anderer ET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arbeitet der andere Elternteil in Deutschland (nicht-selbstständig oder selbstständig) oder hat der andere Elternteil einen Arbeitsvertrag nach deutschem Recht?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>' attribute.
	 * @see #isSetAuslaendischesArbeitsverhaeltnisAndererET()
	 * @see #unsetAuslaendischesArbeitsverhaeltnisAndererET()
	 * @see #setAuslaendischesArbeitsverhaeltnisAndererET(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslaendischesArbeitsverhaeltnisType_AuslaendischesArbeitsverhaeltnisAndererET()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='auslaendischesArbeitsverhaeltnisAndererET' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAuslaendischesArbeitsverhaeltnisAndererET();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnisAndererET <em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>' attribute.
	 * @see #isSetAuslaendischesArbeitsverhaeltnisAndererET()
	 * @see #unsetAuslaendischesArbeitsverhaeltnisAndererET()
	 * @see #isAuslaendischesArbeitsverhaeltnisAndererET()
	 * @generated
	 */
	void setAuslaendischesArbeitsverhaeltnisAndererET(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnisAndererET <em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuslaendischesArbeitsverhaeltnisAndererET()
	 * @see #isAuslaendischesArbeitsverhaeltnisAndererET()
	 * @see #setAuslaendischesArbeitsverhaeltnisAndererET(boolean)
	 * @generated
	 */
	void unsetAuslaendischesArbeitsverhaeltnisAndererET();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnisAndererET <em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>' attribute is set.
	 * @see #unsetAuslaendischesArbeitsverhaeltnisAndererET()
	 * @see #isAuslaendischesArbeitsverhaeltnisAndererET()
	 * @see #setAuslaendischesArbeitsverhaeltnisAndererET(boolean)
	 * @generated
	 */
	boolean isSetAuslaendischesArbeitsverhaeltnisAndererET();

} // AuslaendischesArbeitsverhaeltnisType
