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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behinderung Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angabe über Behindertenstatus des Kindes, relevant für Anzahl gemeinsamer Partnermonate
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType#isBehinderungKind <em>Behinderung Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType#getNachweisBehinderungKind <em>Nachweis Behinderung Kind</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBehinderungKindType()
 * @model extendedMetaData="name='BehinderungKindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BehinderungKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Behinderung Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe über Behindertenstatus des Kindes, relevant für Anzahl gemeinsamer Partnermonate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behinderung Kind</em>' attribute.
	 * @see #isSetBehinderungKind()
	 * @see #unsetBehinderungKind()
	 * @see #setBehinderungKind(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBehinderungKindType_BehinderungKind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='behinderungKind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBehinderungKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType#isBehinderungKind <em>Behinderung Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behinderung Kind</em>' attribute.
	 * @see #isSetBehinderungKind()
	 * @see #unsetBehinderungKind()
	 * @see #isBehinderungKind()
	 * @generated
	 */
	void setBehinderungKind(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType#isBehinderungKind <em>Behinderung Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBehinderungKind()
	 * @see #isBehinderungKind()
	 * @see #setBehinderungKind(boolean)
	 * @generated
	 */
	void unsetBehinderungKind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType#isBehinderungKind <em>Behinderung Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Behinderung Kind</em>' attribute is set.
	 * @see #unsetBehinderungKind()
	 * @see #isBehinderungKind()
	 * @see #setBehinderungKind(boolean)
	 * @generated
	 */
	boolean isSetBehinderungKind();

	/**
	 * Returns the value of the '<em><b>Nachweis Behinderung Kind</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe über Behindertenstatus des Kindes, relevant für Anzahl gemeinsamer Partnermonate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Behinderung Kind</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBehinderungKindType_NachweisBehinderungKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisBehinderungKind' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisBehinderungKind();

} // BehinderungKindType
