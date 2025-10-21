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
package de.xoev.xfamilie.baukasten._1.baukasten;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bankverbindung Inhaber Optional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zur Bankverbindung einer Person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getInhaber <em>Inhaber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getIban <em>Iban</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getBic <em>Bic</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getInstitut <em>Institut</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getBankverbindungInhaberOptionalType()
 * @model extendedMetaData="name='BankverbindungInhaberOptionalType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BankverbindungInhaberOptionalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Inhaber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Kontoinhabers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inhaber</em>' containment reference.
	 * @see #setInhaber(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getBankverbindungInhaberOptionalType_Inhaber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inhaber' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getInhaber();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getInhaber <em>Inhaber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhaber</em>' containment reference.
	 * @see #getInhaber()
	 * @generated
	 */
	void setInhaber(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBAN (International Bank Account Number)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iban</em>' attribute.
	 * @see #setIban(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getBankverbindungInhaberOptionalType_Iban()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='iban' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIban();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getIban <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iban</em>' attribute.
	 * @see #getIban()
	 * @generated
	 */
	void setIban(String value);

	/**
	 * Returns the value of the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business Identifier Code/Geschäftskennzeichen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bic</em>' attribute.
	 * @see #setBic(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getBankverbindungInhaberOptionalType_Bic()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='bic' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBic();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getBic <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bic</em>' attribute.
	 * @see #getBic()
	 * @generated
	 */
	void setBic(String value);

	/**
	 * Returns the value of the '<em><b>Institut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Bankinstituts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institut</em>' attribute.
	 * @see #setInstitut(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getBankverbindungInhaberOptionalType_Institut()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='institut' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstitut();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getInstitut <em>Institut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institut</em>' attribute.
	 * @see #getInstitut()
	 * @generated
	 */
	void setInstitut(String value);

} // BankverbindungInhaberOptionalType
