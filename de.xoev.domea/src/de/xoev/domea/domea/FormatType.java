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
 * A representation of the model object '<em><b>Format Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein Format gibt die Syntax und Semantik einer Datei (z. B. Primärdokument, Aktenplandatei) an.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.FormatType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.FormatType#getSonstigerName <em>Sonstiger Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.FormatType#getVersion <em>Version</em>}</li>
 *   <li>{@link de.xoev.domea.domea.FormatType#getPrimaerdokument <em>Primaerdokument</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getFormatType()
 * @model extendedMetaData="name='FormatType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FormatType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name enthält den Code-Wert zu dem Dateiformat.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(DateiformatCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getFormatType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	DateiformatCodeType getName();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.FormatType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(DateiformatCodeType value);

	/**
	 * Returns the value of the '<em><b>Sonstiger Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der sonstige Name des Formats.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstiger Name</em>' attribute.
	 * @see #setSonstigerName(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getFormatType_SonstigerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SonstigerName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSonstigerName();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.FormatType#getSonstigerName <em>Sonstiger Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sonstiger Name</em>' attribute.
	 * @see #getSonstigerName()
	 * @generated
	 */
	void setSonstigerName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Version des Formats, z. B. für pdf 1.4 wäre hier "1.4" anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getFormatType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.FormatType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Primaerdokument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über Primaerdokument werden Dateiangaben zum tatsächlich beschriebenen Primärdokument eines Formats angegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primaerdokument</em>' containment reference.
	 * @see #setPrimaerdokument(PrimaerdokumentType)
	 * @see de.xoev.domea.domea.DomeaPackage#getFormatType_Primaerdokument()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Primaerdokument' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimaerdokumentType getPrimaerdokument();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.FormatType#getPrimaerdokument <em>Primaerdokument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primaerdokument</em>' containment reference.
	 * @see #getPrimaerdokument()
	 * @generated
	 */
	void setPrimaerdokument(PrimaerdokumentType value);

} // FormatType
