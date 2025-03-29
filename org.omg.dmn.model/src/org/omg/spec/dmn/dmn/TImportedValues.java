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
package org.omg.spec.dmn.dmn;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TImported Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TImportedValues#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TImportedValues#getExpressionLanguage <em>Expression Language</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTImportedValues()
 * @model extendedMetaData="name='tImportedValues' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TImportedValues extends TImport {
	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Element</em>' attribute.
	 * @see #setImportedElement(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTImportedValues_ImportedElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='importedElement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImportedElement();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TImportedValues#getImportedElement <em>Imported Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Element</em>' attribute.
	 * @see #getImportedElement()
	 * @generated
	 */
	void setImportedElement(String value);

	/**
	 * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Language</em>' attribute.
	 * @see #setExpressionLanguage(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTImportedValues_ExpressionLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='expressionLanguage'"
	 * @generated
	 */
	String getExpressionLanguage();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TImportedValues#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Language</em>' attribute.
	 * @see #getExpressionLanguage()
	 * @generated
	 */
	void setExpressionLanguage(String value);

} // TImportedValues
