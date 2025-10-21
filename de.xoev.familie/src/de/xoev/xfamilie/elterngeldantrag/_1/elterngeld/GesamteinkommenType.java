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
 * A representation of the model object '<em><b>Gesamteinkommen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType#getGesamteinkommen <em>Gesamteinkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType#getNachweisGesamteinkommen <em>Nachweis Gesamteinkommen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGesamteinkommenType()
 * @model extendedMetaData="name='GesamteinkommenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GesamteinkommenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Gesamteinkommen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gesamteinkommen</em>' containment reference.
	 * @see #setGesamteinkommen(CodeGesamteinkommenType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGesamteinkommenType_Gesamteinkommen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gesamteinkommen' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeGesamteinkommenType getGesamteinkommen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType#getGesamteinkommen <em>Gesamteinkommen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gesamteinkommen</em>' containment reference.
	 * @see #getGesamteinkommen()
	 * @generated
	 */
	void setGesamteinkommen(CodeGesamteinkommenType value);

	/**
	 * Returns the value of the '<em><b>Nachweis Gesamteinkommen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Gesamteinkommen</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGesamteinkommenType_NachweisGesamteinkommen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisGesamteinkommen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisGesamteinkommen();

} // GesamteinkommenType
