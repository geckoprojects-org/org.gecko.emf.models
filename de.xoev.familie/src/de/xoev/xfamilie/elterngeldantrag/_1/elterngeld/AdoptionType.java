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
 * A representation of the model object '<em><b>Adoption Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#isAdoption <em>Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#getAdoptionHaushaltsaufnahme <em>Adoption Haushaltsaufnahme</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#getNachweisAdoption <em>Nachweis Adoption</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAdoptionType()
 * @model extendedMetaData="name='AdoptionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdoptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Adoption des Kindes. Hierzu gehören auch Adoptionspflege und Stiefkindadoption.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adoption</em>' attribute.
	 * @see #isSetAdoption()
	 * @see #unsetAdoption()
	 * @see #setAdoption(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAdoptionType_Adoption()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='adoption' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAdoption();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#isAdoption <em>Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adoption</em>' attribute.
	 * @see #isSetAdoption()
	 * @see #unsetAdoption()
	 * @see #isAdoption()
	 * @generated
	 */
	void setAdoption(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#isAdoption <em>Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdoption()
	 * @see #isAdoption()
	 * @see #setAdoption(boolean)
	 * @generated
	 */
	void unsetAdoption();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#isAdoption <em>Adoption</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Adoption</em>' attribute is set.
	 * @see #unsetAdoption()
	 * @see #isAdoption()
	 * @see #setAdoption(boolean)
	 * @generated
	 */
	boolean isSetAdoption();

	/**
	 * Returns the value of the '<em><b>Adoption Haushaltsaufnahme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum der Aufnahme des Kindes in den Haushalt oder Beginn der Adoptionspflege.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adoption Haushaltsaufnahme</em>' attribute.
	 * @see #setAdoptionHaushaltsaufnahme(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAdoptionType_AdoptionHaushaltsaufnahme()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='adoptionHaushaltsaufnahme' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAdoptionHaushaltsaufnahme();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#getAdoptionHaushaltsaufnahme <em>Adoption Haushaltsaufnahme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adoption Haushaltsaufnahme</em>' attribute.
	 * @see #getAdoptionHaushaltsaufnahme()
	 * @generated
	 */
	void setAdoptionHaushaltsaufnahme(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nachweis Adoption</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Adoption</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAdoptionType_NachweisAdoption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisAdoption' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisAdoption();

} // AdoptionType
