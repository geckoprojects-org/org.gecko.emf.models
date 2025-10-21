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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten;

import de.xoev.schemata.code.code.Code;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rueckweisungsgrund Spezifisch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In diesem Datentyp wird ein Grund für die Rückweisung der Nachricht in Form eines beliebigen kontextspezifischen Fehlercodes und/oder einer Fehlerbeschreibung genauer spezifiziert.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType#getCode <em>Code</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType#getBeschreibung <em>Beschreibung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getRueckweisungsgrundSpezifischType()
 * @model extendedMetaData="name='RueckweisungsgrundSpezifischType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RueckweisungsgrundSpezifischType extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getRueckweisungsgrundSpezifischType_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beschreibung</em>' attribute.
	 * @see #setBeschreibung(String)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getRueckweisungsgrundSpezifischType_Beschreibung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='beschreibung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

} // RueckweisungsgrundSpezifischType
