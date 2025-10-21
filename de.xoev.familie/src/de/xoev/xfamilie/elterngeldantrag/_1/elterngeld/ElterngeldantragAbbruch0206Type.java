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

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elterngeldantrag Abbruch0206 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type#getAnfrageID <em>Anfrage ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type#getGrundAbbruch <em>Grund Abbruch</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAbbruch0206Type()
 * @model extendedMetaData="name='elterngeldantrag.abbruch.0206_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElterngeldantragAbbruch0206Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Anfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anfrage ID</em>' attribute.
	 * @see #setAnfrageID(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAbbruch0206Type_AnfrageID()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='anfrageID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnfrageID();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type#getAnfrageID <em>Anfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anfrage ID</em>' attribute.
	 * @see #getAnfrageID()
	 * @generated
	 */
	void setAnfrageID(String value);

	/**
	 * Returns the value of the '<em><b>Grund Abbruch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grund Abbruch</em>' containment reference.
	 * @see #setGrundAbbruch(CodeAbbruchgrundType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAbbruch0206Type_GrundAbbruch()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='grundAbbruch' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAbbruchgrundType getGrundAbbruch();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type#getGrundAbbruch <em>Grund Abbruch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grund Abbruch</em>' containment reference.
	 * @see #getGrundAbbruch()
	 * @generated
	 */
	void setGrundAbbruch(CodeAbbruchgrundType value);

} // ElterngeldantragAbbruch0206Type
