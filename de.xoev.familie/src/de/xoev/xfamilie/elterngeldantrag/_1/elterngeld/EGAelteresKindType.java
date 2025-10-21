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
 * A representation of the model object '<em><b>EG Aelteres Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#isBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#getZeitraumEGAelteresKind <em>Zeitraum EG Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#getNachweisEGAelteresKind <em>Nachweis EG Aelteres Kind</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEGAelteresKindType()
 * @model extendedMetaData="name='EGAelteresKindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EGAelteresKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezug EG Aelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug EG Aelteres Kind</em>' attribute.
	 * @see #isSetBezugEGAelteresKind()
	 * @see #unsetBezugEGAelteresKind()
	 * @see #setBezugEGAelteresKind(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEGAelteresKindType_BezugEGAelteresKind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bezugEGAelteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugEGAelteresKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#isBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug EG Aelteres Kind</em>' attribute.
	 * @see #isSetBezugEGAelteresKind()
	 * @see #unsetBezugEGAelteresKind()
	 * @see #isBezugEGAelteresKind()
	 * @generated
	 */
	void setBezugEGAelteresKind(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#isBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugEGAelteresKind()
	 * @see #isBezugEGAelteresKind()
	 * @see #setBezugEGAelteresKind(boolean)
	 * @generated
	 */
	void unsetBezugEGAelteresKind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#isBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug EG Aelteres Kind</em>' attribute is set.
	 * @see #unsetBezugEGAelteresKind()
	 * @see #isBezugEGAelteresKind()
	 * @see #setBezugEGAelteresKind(boolean)
	 * @generated
	 */
	boolean isSetBezugEGAelteresKind();

	/**
	 * Returns the value of the '<em><b>Zeitraum EG Aelteres Kind</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeitraum EG Aelteres Kind</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEGAelteresKindType_ZeitraumEGAelteresKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraumEGAelteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getZeitraumEGAelteresKind();

	/**
	 * Returns the value of the '<em><b>Nachweis EG Aelteres Kind</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis EG Aelteres Kind</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEGAelteresKindType_NachweisEGAelteresKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisEGAelteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisEGAelteresKind();

} // EGAelteresKindType
