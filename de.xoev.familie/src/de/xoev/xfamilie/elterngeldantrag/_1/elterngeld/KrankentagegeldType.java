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
 * A representation of the model object '<em><b>Krankentagegeld Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#isBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#getZeitraumKrankentagegeld <em>Zeitraum Krankentagegeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#getNachweisKrankentagegeld <em>Nachweis Krankentagegeld</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankentagegeldType()
 * @model extendedMetaData="name='KrankentagegeldType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KrankentagegeldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezug Krankentagegeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Krankentagegeld</em>' attribute.
	 * @see #isSetBezugKrankentagegeld()
	 * @see #unsetBezugKrankentagegeld()
	 * @see #setBezugKrankentagegeld(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankentagegeldType_BezugKrankentagegeld()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bezugKrankentagegeld' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugKrankentagegeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#isBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Krankentagegeld</em>' attribute.
	 * @see #isSetBezugKrankentagegeld()
	 * @see #unsetBezugKrankentagegeld()
	 * @see #isBezugKrankentagegeld()
	 * @generated
	 */
	void setBezugKrankentagegeld(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#isBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugKrankentagegeld()
	 * @see #isBezugKrankentagegeld()
	 * @see #setBezugKrankentagegeld(boolean)
	 * @generated
	 */
	void unsetBezugKrankentagegeld();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#isBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug Krankentagegeld</em>' attribute is set.
	 * @see #unsetBezugKrankentagegeld()
	 * @see #isBezugKrankentagegeld()
	 * @see #setBezugKrankentagegeld(boolean)
	 * @generated
	 */
	boolean isSetBezugKrankentagegeld();

	/**
	 * Returns the value of the '<em><b>Zeitraum Krankentagegeld</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeitraum Krankentagegeld</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankentagegeldType_ZeitraumKrankentagegeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraumKrankentagegeld' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getZeitraumKrankentagegeld();

	/**
	 * Returns the value of the '<em><b>Nachweis Krankentagegeld</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Krankentagegeld</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankentagegeldType_NachweisKrankentagegeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisKrankentagegeld' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisKrankentagegeld();

} // KrankentagegeldType
