/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.xoev.code;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der XÖV-Datentyp Code ermöglicht die Übermittlung von Werten, so genannter Codes, aus vordefinierten Codelisten. Eine Codeliste ist eine Liste von Codes und der Beschreibung ihrer jeweiligen Bedeutung. Eine entscheidende Eigenschaft des Datentyps ist die Möglichkeit auf differenzierte Weise Bezug zu Codelisten zu nehmen (Code-Typ 1 bis 4). In jedem Fall erlauben die übermittelten Daten eine eindeutige Identifizierung der zugrundeliegenden Codeliste.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.code.Code#getCode <em>Code</em>}</li>
 *   <li>{@link de.xoev.code.Code#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.code.Code#getListURI <em>List URI</em>}</li>
 *   <li>{@link de.xoev.code.Code#getListVersionID <em>List Version ID</em>}</li>
 * </ul>
 *
 * @see de.xoev.code.CodePackage#getCode()
 * @model extendedMetaData="name='Code' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Code extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem XML-Element wird der Code einer Codeliste übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see de.xoev.code.CodePackage#getCode_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Token" required="true"
	 *        extendedMetaData="kind='element' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link de.xoev.code.Code#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem optionalen XML-Element kann die Beschreibung des Codes, wie in der jeweiligen Beschreibungsspalte der Codeliste vorgegeben, übermittelt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.code.CodePackage#getCode_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.code.Code#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem XML-Attribut wird die Kennung der Codeliste übermittelt, in deren Kontext der jeweilige Code zu interpretieren ist. Die Kennung identifiziert die Codeliste, nicht jedoch deren Version eindeutig. Wird bereits im Rahmen des XÖV-Standards eine Kennung vorgegeben (es handelt sich in diesem Fall um einen Code-Typ 1, 2 oder 3) darf auf eine nochmalige Angabe der Kennung bei der Übermittlung eines Codes verzichtet werden. Aus diesem Grund ist das XML-Attribut listURI zunächst als optional deklariert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List URI</em>' attribute.
	 * @see #setListURI(String)
	 * @see de.xoev.code.CodePackage#getCode_ListURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='listURI'"
	 * @generated
	 */
	String getListURI();

	/**
	 * Sets the value of the '{@link de.xoev.code.Code#getListURI <em>List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List URI</em>' attribute.
	 * @see #getListURI()
	 * @generated
	 */
	void setListURI(String value);

	/**
	 * Returns the value of the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die konkrete Version der zu nutzenden Codeliste wird mit diesem XML-Attribut übertragen. Analog zum listURI ist die Bestimmung der Version einer Codeliste bei der Übertragung eines Codes zwingend. Die Version kann jedoch ebenfalls bereits im XÖV-Standard festgelegt werden (es handelt sich in diesem Fall um einen Code-Typ 1 oder 2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Version ID</em>' attribute.
	 * @see #setListVersionID(String)
	 * @see de.xoev.code.CodePackage#getCode_ListVersionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='listVersionID'"
	 * @generated
	 */
	String getListVersionID();

	/**
	 * Sets the value of the '{@link de.xoev.code.Code#getListVersionID <em>List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Version ID</em>' attribute.
	 * @see #getListVersionID()
	 * @generated
	 */
	void setListVersionID(String value);

} // Code
