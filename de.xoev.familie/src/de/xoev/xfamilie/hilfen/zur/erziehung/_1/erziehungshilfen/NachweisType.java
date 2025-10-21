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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachweis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType#getNachweisBeschreibung <em>Nachweis Beschreibung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType#getNachweisDokument <em>Nachweis Dokument</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweisType()
 * @model extendedMetaData="name='NachweisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachweisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachweis Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Beschreibung</em>' attribute.
	 * @see #setNachweisBeschreibung(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweisType_NachweisBeschreibung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='nachweisBeschreibung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNachweisBeschreibung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType#getNachweisBeschreibung <em>Nachweis Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis Beschreibung</em>' attribute.
	 * @see #getNachweisBeschreibung()
	 * @generated
	 */
	void setNachweisBeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Nachweis Dokument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Dokument</em>' containment reference.
	 * @see #setNachweisDokument(NachweisdokumentType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweisType_NachweisDokument()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweisDokument' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getNachweisDokument();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType#getNachweisDokument <em>Nachweis Dokument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis Dokument</em>' containment reference.
	 * @see #getNachweisDokument()
	 * @generated
	 */
	void setNachweisDokument(NachweisdokumentType value);

} // NachweisType
