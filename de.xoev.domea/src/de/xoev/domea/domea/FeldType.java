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
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feld Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein Feld ist ein anwendungsspezifisches Metadatum, das bei dem Austausch eines Schriftgutobjektes übergeben wird. Die Konfiguration eines Feldes in den austauschenden Systemen muss zwischen den Kommunikationspartnern abgesprochen und in den Systemen umgesetzt sein.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.FeldType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.FeldType#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.FeldType#getDatentyp <em>Datentyp</em>}</li>
 *   <li>{@link de.xoev.domea.domea.FeldType#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getFeldType()
 * @model extendedMetaData="name='FeldType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name des Feldes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getFeldType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.FeldType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Hinweise und Erläuterungen zu einem Feld.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beschreibung</em>' attribute.
	 * @see #setBeschreibung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getFeldType_Beschreibung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Beschreibung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.FeldType#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Datentyp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Datentyp des Feldwertes. Gültige Angaben sind die W3C-Datentypen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datentyp</em>' containment reference.
	 * @see #setDatentyp(DatentypCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getFeldType_Datentyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Datentyp' namespace='##targetNamespace'"
	 * @generated
	 */
	DatentypCodeType getDatentyp();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.FeldType#getDatentyp <em>Datentyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datentyp</em>' containment reference.
	 * @see #getDatentyp()
	 * @generated
	 */
	void setDatentyp(DatentypCodeType value);

	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Wert des Feldes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getFeldType_Wert()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Wert' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWert();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.FeldType#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(String value);

} // FeldType
