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
package org.cyclonedx.schema.bom;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.FrameType#getPackage <em>Package</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FrameType#getModule <em>Module</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FrameType#getFunction <em>Function</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FrameType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FrameType#getLine <em>Line</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FrameType#getColumn <em>Column</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FrameType#getFullFilename <em>Full Filename</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getFrameType()
 * @model extendedMetaData="name='frame_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A package organizes modules into namespaces, providing a unique namespace for each type it contains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFrameType_Package()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FrameType#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A module or class that encloses functions/methods and other code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFrameType_Module()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='module' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FrameType#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A block of code designed to perform a particular task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFrameType_Function()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FrameType#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional arguments that are passed to the module or function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFrameType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType1 getParameters();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FrameType#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParametersType1 value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The line number the code that is called resides on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(BigInteger)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFrameType_Line()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='line' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLine();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FrameType#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The column the code that is called resides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(BigInteger)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFrameType_Column()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getColumn();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FrameType#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Full Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full path and filename of the module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Filename</em>' attribute.
	 * @see #setFullFilename(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFrameType_FullFilename()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='fullFilename' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFullFilename();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FrameType#getFullFilename <em>Full Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Filename</em>' attribute.
	 * @see #getFullFilename()
	 * @generated
	 */
	void setFullFilename(String value);

} // FrameType
