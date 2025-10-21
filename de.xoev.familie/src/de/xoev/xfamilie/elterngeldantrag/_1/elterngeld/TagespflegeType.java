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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagespflege Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angabe, ob die antragstellende Person eine Tagespflegeperson ist. Anzahl der Kinder: Anzahl der Kinder, die betreut werden (ohne eigene Kinder).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#isTagespflege <em>Tagespflege</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#getAnzahlDerKinderOhneEigeneKinder <em>Anzahl Der Kinder Ohne Eigene Kinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getTagespflegeType()
 * @model extendedMetaData="name='TagespflegeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TagespflegeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tagespflege</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die antragstellende Person eine Tagespflegeperson ist. Anzahl der Kinder: Anzahl der Kinder, die betreut werden (ohne eigene Kinder).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tagespflege</em>' attribute.
	 * @see #isSetTagespflege()
	 * @see #unsetTagespflege()
	 * @see #setTagespflege(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getTagespflegeType_Tagespflege()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='tagespflege' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isTagespflege();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#isTagespflege <em>Tagespflege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagespflege</em>' attribute.
	 * @see #isSetTagespflege()
	 * @see #unsetTagespflege()
	 * @see #isTagespflege()
	 * @generated
	 */
	void setTagespflege(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#isTagespflege <em>Tagespflege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTagespflege()
	 * @see #isTagespflege()
	 * @see #setTagespflege(boolean)
	 * @generated
	 */
	void unsetTagespflege();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#isTagespflege <em>Tagespflege</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tagespflege</em>' attribute is set.
	 * @see #unsetTagespflege()
	 * @see #isTagespflege()
	 * @see #setTagespflege(boolean)
	 * @generated
	 */
	boolean isSetTagespflege();

	/**
	 * Returns the value of the '<em><b>Anzahl Der Kinder Ohne Eigene Kinder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Der Kinder Ohne Eigene Kinder</em>' attribute.
	 * @see #setAnzahlDerKinderOhneEigeneKinder(BigInteger)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getTagespflegeType_AnzahlDerKinderOhneEigeneKinder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='anzahlDerKinderOhneEigeneKinder' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAnzahlDerKinderOhneEigeneKinder();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#getAnzahlDerKinderOhneEigeneKinder <em>Anzahl Der Kinder Ohne Eigene Kinder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Der Kinder Ohne Eigene Kinder</em>' attribute.
	 * @see #getAnzahlDerKinderOhneEigeneKinder()
	 * @generated
	 */
	void setAnzahlDerKinderOhneEigeneKinder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getTagespflegeType_Nachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweis();

} // TagespflegeType
