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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traeger Krankenversicherung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Träger der Krankenversicherung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getBekannt <em>Bekannt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getKvNummer <em>Kv Nummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getTraegerKrankenversicherungType()
 * @model extendedMetaData="name='TraegerKrankenversicherungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TraegerKrankenversicherungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bekannt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob der Träger der Krankenversicherung der antragstellenden Person bekannt ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bekannt</em>' containment reference.
	 * @see #setBekannt(CodeTatsachenbehauptungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getTraegerKrankenversicherungType_Bekannt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bekannt' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeTatsachenbehauptungType getBekannt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getBekannt <em>Bekannt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bekannt</em>' containment reference.
	 * @see #getBekannt()
	 * @generated
	 */
	void setBekannt(CodeTatsachenbehauptungType value);

	/**
	 * Returns the value of the '<em><b>Kv Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zur Krankenversicherungsnummer. Regel: Falls "bekannt" true ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kv Nummer</em>' attribute.
	 * @see #setKvNummer(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getTraegerKrankenversicherungType_KvNummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='kvNummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKvNummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getKvNummer <em>Kv Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kv Nummer</em>' attribute.
	 * @see #getKvNummer()
	 * @generated
	 */
	void setKvNummer(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zur "bezeichnung" der Krankenversicherung. Regel: Falls "bekannt" true ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getTraegerKrankenversicherungType_Name()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TraegerKrankenversicherungType
