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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Berufsbildung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angabe, ob die antragstellende Person sich im Bezugszeitraum in Berufsbildung befindet. Voraussichtliches Ende: Datumsangabe des vorraussichtlichen Endes der Berufsbildung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#isBerufsbildung <em>Berufsbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#getAusbildungEndeVoraussichtlich <em>Ausbildung Ende Voraussichtlich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBerufsbildungType()
 * @model extendedMetaData="name='BerufsbildungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BerufsbildungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Berufsbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die antragstellende Person sich im Bezugszeitraum in Berufsbildung befindet. Voraussichtliches Ende: Datumsangabe des vorraussichtlichen Endes der Berufsbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Berufsbildung</em>' attribute.
	 * @see #isSetBerufsbildung()
	 * @see #unsetBerufsbildung()
	 * @see #setBerufsbildung(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBerufsbildungType_Berufsbildung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='berufsbildung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBerufsbildung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#isBerufsbildung <em>Berufsbildung</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#isBerufsbildung <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBerufsbildung()
	 * @see #isBerufsbildung()
	 * @see #setBerufsbildung(boolean)
	 * @generated
	 */
	void unsetBerufsbildung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#isBerufsbildung <em>Berufsbildung</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ausbildung Ende Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ausbildung Ende Voraussichtlich</em>' attribute.
	 * @see #setAusbildungEndeVoraussichtlich(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBerufsbildungType_AusbildungEndeVoraussichtlich()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='ausbildungEndeVoraussichtlich' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAusbildungEndeVoraussichtlich();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#getAusbildungEndeVoraussichtlich <em>Ausbildung Ende Voraussichtlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausbildung Ende Voraussichtlich</em>' attribute.
	 * @see #getAusbildungEndeVoraussichtlich()
	 * @generated
	 */
	void setAusbildungEndeVoraussichtlich(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBerufsbildungType_Nachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweis();

} // BerufsbildungType
