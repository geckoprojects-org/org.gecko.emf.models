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
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Krankengeld Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#isBezugKrankengeldSchwangerschaft <em>Bezug Krankengeld Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#getZeitraumKrankengeldSchwangerschaft <em>Zeitraum Krankengeld Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#getNachweisKrankengeldSchwangerschaft <em>Nachweis Krankengeld Schwangerschaft</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankengeldType()
 * @model extendedMetaData="name='KrankengeldType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KrankengeldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezug Krankengeld Schwangerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Krankengeld Schwangerschaft</em>' attribute.
	 * @see #isSetBezugKrankengeldSchwangerschaft()
	 * @see #unsetBezugKrankengeldSchwangerschaft()
	 * @see #setBezugKrankengeldSchwangerschaft(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankengeldType_BezugKrankengeldSchwangerschaft()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bezugKrankengeldSchwangerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugKrankengeldSchwangerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#isBezugKrankengeldSchwangerschaft <em>Bezug Krankengeld Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Krankengeld Schwangerschaft</em>' attribute.
	 * @see #isSetBezugKrankengeldSchwangerschaft()
	 * @see #unsetBezugKrankengeldSchwangerschaft()
	 * @see #isBezugKrankengeldSchwangerschaft()
	 * @generated
	 */
	void setBezugKrankengeldSchwangerschaft(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#isBezugKrankengeldSchwangerschaft <em>Bezug Krankengeld Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugKrankengeldSchwangerschaft()
	 * @see #isBezugKrankengeldSchwangerschaft()
	 * @see #setBezugKrankengeldSchwangerschaft(boolean)
	 * @generated
	 */
	void unsetBezugKrankengeldSchwangerschaft();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#isBezugKrankengeldSchwangerschaft <em>Bezug Krankengeld Schwangerschaft</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug Krankengeld Schwangerschaft</em>' attribute is set.
	 * @see #unsetBezugKrankengeldSchwangerschaft()
	 * @see #isBezugKrankengeldSchwangerschaft()
	 * @see #setBezugKrankengeldSchwangerschaft(boolean)
	 * @generated
	 */
	boolean isSetBezugKrankengeldSchwangerschaft();

	/**
	 * Returns the value of the '<em><b>Zeitraum Krankengeld Schwangerschaft</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeitraum Krankengeld Schwangerschaft</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankengeldType_ZeitraumKrankengeldSchwangerschaft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraumKrankengeldSchwangerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getZeitraumKrankengeldSchwangerschaft();

	/**
	 * Returns the value of the '<em><b>Nachweis Krankengeld Schwangerschaft</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Krankengeld Schwangerschaft</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankengeldType_NachweisKrankengeldSchwangerschaft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisKrankengeldSchwangerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisKrankengeldSchwangerschaft();

} // KrankengeldType
