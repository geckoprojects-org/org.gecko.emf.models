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
 * A representation of the model object '<em><b>TLiteral Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TLiteralExpression#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TLiteralExpression#getImportedValues <em>Imported Values</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TLiteralExpression#getExpressionLanguage <em>Expression Language</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTLiteralExpression()
 * @model extendedMetaData="name='tLiteralExpression' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TLiteralExpression extends TExpression {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTLiteralExpression_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TLiteralExpression#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Imported Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Values</em>' containment reference.
	 * @see #setImportedValues(TImportedValues)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTLiteralExpression_ImportedValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importedValues' namespace='##targetNamespace'"
	 * @generated
	 */
	TImportedValues getImportedValues();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TLiteralExpression#getImportedValues <em>Imported Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Values</em>' containment reference.
	 * @see #getImportedValues()
	 * @generated
	 */
	void setImportedValues(TImportedValues value);

	/**
	 * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Language</em>' attribute.
	 * @see #setExpressionLanguage(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTLiteralExpression_ExpressionLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='expressionLanguage'"
	 * @generated
	 */
	String getExpressionLanguage();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TLiteralExpression#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Language</em>' attribute.
	 * @see #getExpressionLanguage()
	 * @generated
	 */
	void setExpressionLanguage(String value);

} // TLiteralExpression
