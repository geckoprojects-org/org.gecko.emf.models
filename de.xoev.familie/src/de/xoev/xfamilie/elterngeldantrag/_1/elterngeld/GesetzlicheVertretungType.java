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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeAnredeType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gesetzliche Vertretung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getAnredeGesetzlicheVertretung <em>Anrede Gesetzliche Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNameGesetzlicheVertretung <em>Name Gesetzliche Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getAnschriftGesetzlicheVertretung <em>Anschrift Gesetzliche Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNutzerkontoGesetzlicheVertretung <em>Nutzerkonto Gesetzliche Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNachweisGesetzlicheVertretung <em>Nachweis Gesetzliche Vertretung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGesetzlicheVertretungType()
 * @model extendedMetaData="name='GesetzlicheVertretungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GesetzlicheVertretungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Anrede Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anrede Gesetzliche Vertretung</em>' containment reference.
	 * @see #setAnredeGesetzlicheVertretung(CodeAnredeType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGesetzlicheVertretungType_AnredeGesetzlicheVertretung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anredeGesetzlicheVertretung' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAnredeType getAnredeGesetzlicheVertretung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getAnredeGesetzlicheVertretung <em>Anrede Gesetzliche Vertretung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anrede Gesetzliche Vertretung</em>' containment reference.
	 * @see #getAnredeGesetzlicheVertretung()
	 * @generated
	 */
	void setAnredeGesetzlicheVertretung(CodeAnredeType value);

	/**
	 * Returns the value of the '<em><b>Name Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Gesetzliche Vertretung</em>' containment reference.
	 * @see #setNameGesetzlicheVertretung(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGesetzlicheVertretungType_NameGesetzlicheVertretung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nameGesetzlicheVertretung' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getNameGesetzlicheVertretung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNameGesetzlicheVertretung <em>Name Gesetzliche Vertretung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Gesetzliche Vertretung</em>' containment reference.
	 * @see #getNameGesetzlicheVertretung()
	 * @generated
	 */
	void setNameGesetzlicheVertretung(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Anschrift Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Anschrift des antragstellenden Elternteils
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Gesetzliche Vertretung</em>' containment reference.
	 * @see #setAnschriftGesetzlicheVertretung(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGesetzlicheVertretungType_AnschriftGesetzlicheVertretung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftGesetzlicheVertretung' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAnschriftGesetzlicheVertretung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getAnschriftGesetzlicheVertretung <em>Anschrift Gesetzliche Vertretung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Gesetzliche Vertretung</em>' containment reference.
	 * @see #getAnschriftGesetzlicheVertretung()
	 * @generated
	 */
	void setAnschriftGesetzlicheVertretung(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Nutzerkonto Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutzerkonto Gesetzliche Vertretung</em>' containment reference.
	 * @see #setNutzerkontoGesetzlicheVertretung(NutzerkontoType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGesetzlicheVertretungType_NutzerkontoGesetzlicheVertretung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nutzerkontoGesetzlicheVertretung' namespace='##targetNamespace'"
	 * @generated
	 */
	NutzerkontoType getNutzerkontoGesetzlicheVertretung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNutzerkontoGesetzlicheVertretung <em>Nutzerkonto Gesetzliche Vertretung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutzerkonto Gesetzliche Vertretung</em>' containment reference.
	 * @see #getNutzerkontoGesetzlicheVertretung()
	 * @generated
	 */
	void setNutzerkontoGesetzlicheVertretung(NutzerkontoType value);

	/**
	 * Returns the value of the '<em><b>Nachweis Gesetzliche Vertretung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Gesetzliche Vertretung</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGesetzlicheVertretungType_NachweisGesetzlicheVertretung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisGesetzlicheVertretung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisGesetzlicheVertretung();

} // GesetzlicheVertretungType
