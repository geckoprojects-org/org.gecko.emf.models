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
package net.opengis.gml.gml;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.FormulaType#getA <em>A</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FormulaType#getB <em>B</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FormulaType#getC <em>C</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FormulaType#getD <em>D</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getFormulaType()
 * @model extendedMetaData="name='FormulaType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FormulaType extends EObject {
	/**
	 * Returns the value of the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' attribute.
	 * @see #isSetA()
	 * @see #unsetA()
	 * @see #setA(double)
	 * @see net.opengis.gml.gml.GMLPackage#getFormulaType_A()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace'"
	 * @generated
	 */
	double getA();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FormulaType#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' attribute.
	 * @see #isSetA()
	 * @see #unsetA()
	 * @see #getA()
	 * @generated
	 */
	void setA(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.FormulaType#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetA()
	 * @see #getA()
	 * @see #setA(double)
	 * @generated
	 */
	void unsetA();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.FormulaType#getA <em>A</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>A</em>' attribute is set.
	 * @see #unsetA()
	 * @see #getA()
	 * @see #setA(double)
	 * @generated
	 */
	boolean isSetA();

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #setB(double)
	 * @see net.opengis.gml.gml.GMLPackage#getFormulaType_B()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace'"
	 * @generated
	 */
	double getB();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FormulaType#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #getB()
	 * @generated
	 */
	void setB(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.FormulaType#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB()
	 * @see #getB()
	 * @see #setB(double)
	 * @generated
	 */
	void unsetB();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.FormulaType#getB <em>B</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B</em>' attribute is set.
	 * @see #unsetB()
	 * @see #getB()
	 * @see #setB(double)
	 * @generated
	 */
	boolean isSetB();

	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' attribute.
	 * @see #isSetC()
	 * @see #unsetC()
	 * @see #setC(double)
	 * @see net.opengis.gml.gml.GMLPackage#getFormulaType_C()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='c' namespace='##targetNamespace'"
	 * @generated
	 */
	double getC();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FormulaType#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' attribute.
	 * @see #isSetC()
	 * @see #unsetC()
	 * @see #getC()
	 * @generated
	 */
	void setC(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.FormulaType#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetC()
	 * @see #getC()
	 * @see #setC(double)
	 * @generated
	 */
	void unsetC();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.FormulaType#getC <em>C</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>C</em>' attribute is set.
	 * @see #unsetC()
	 * @see #getC()
	 * @see #setC(double)
	 * @generated
	 */
	boolean isSetC();

	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #isSetD()
	 * @see #unsetD()
	 * @see #setD(double)
	 * @see net.opengis.gml.gml.GMLPackage#getFormulaType_D()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='d' namespace='##targetNamespace'"
	 * @generated
	 */
	double getD();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FormulaType#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #isSetD()
	 * @see #unsetD()
	 * @see #getD()
	 * @generated
	 */
	void setD(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.FormulaType#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetD()
	 * @see #getD()
	 * @see #setD(double)
	 * @generated
	 */
	void unsetD();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.FormulaType#getD <em>D</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>D</em>' attribute is set.
	 * @see #unsetD()
	 * @see #getD()
	 * @see #setD(double)
	 * @generated
	 */
	boolean isSetD();

} // FormulaType
