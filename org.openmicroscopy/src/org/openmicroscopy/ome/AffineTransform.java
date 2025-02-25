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
package org.openmicroscopy.ome;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affine Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A matrix used to transform the shape.
 *         ⎡ A00, A01, A02 ⎤
 *         ⎢ A10, A11, A12 ⎥
 *         ⎣ 0,   0,   1   ⎦
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.AffineTransform#getA00 <em>A00</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.AffineTransform#getA01 <em>A01</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.AffineTransform#getA02 <em>A02</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.AffineTransform#getA10 <em>A10</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.AffineTransform#getA11 <em>A11</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.AffineTransform#getA12 <em>A12</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getAffineTransform()
 * @model extendedMetaData="name='AffineTransform' kind='empty'"
 * @generated
 */
@ProviderType
public interface AffineTransform extends EObject {
	/**
	 * Returns the value of the '<em><b>A00</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A00</em>' attribute.
	 * @see #isSetA00()
	 * @see #unsetA00()
	 * @see #setA00(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getAffineTransform_A00()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='A00'"
	 * @generated
	 */
	float getA00();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA00 <em>A00</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A00</em>' attribute.
	 * @see #isSetA00()
	 * @see #unsetA00()
	 * @see #getA00()
	 * @generated
	 */
	void setA00(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA00 <em>A00</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetA00()
	 * @see #getA00()
	 * @see #setA00(float)
	 * @generated
	 */
	void unsetA00();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA00 <em>A00</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>A00</em>' attribute is set.
	 * @see #unsetA00()
	 * @see #getA00()
	 * @see #setA00(float)
	 * @generated
	 */
	boolean isSetA00();

	/**
	 * Returns the value of the '<em><b>A01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A01</em>' attribute.
	 * @see #isSetA01()
	 * @see #unsetA01()
	 * @see #setA01(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getAffineTransform_A01()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='A01'"
	 * @generated
	 */
	float getA01();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA01 <em>A01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A01</em>' attribute.
	 * @see #isSetA01()
	 * @see #unsetA01()
	 * @see #getA01()
	 * @generated
	 */
	void setA01(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA01 <em>A01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetA01()
	 * @see #getA01()
	 * @see #setA01(float)
	 * @generated
	 */
	void unsetA01();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA01 <em>A01</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>A01</em>' attribute is set.
	 * @see #unsetA01()
	 * @see #getA01()
	 * @see #setA01(float)
	 * @generated
	 */
	boolean isSetA01();

	/**
	 * Returns the value of the '<em><b>A02</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A02</em>' attribute.
	 * @see #isSetA02()
	 * @see #unsetA02()
	 * @see #setA02(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getAffineTransform_A02()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='A02'"
	 * @generated
	 */
	float getA02();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA02 <em>A02</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A02</em>' attribute.
	 * @see #isSetA02()
	 * @see #unsetA02()
	 * @see #getA02()
	 * @generated
	 */
	void setA02(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA02 <em>A02</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetA02()
	 * @see #getA02()
	 * @see #setA02(float)
	 * @generated
	 */
	void unsetA02();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA02 <em>A02</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>A02</em>' attribute is set.
	 * @see #unsetA02()
	 * @see #getA02()
	 * @see #setA02(float)
	 * @generated
	 */
	boolean isSetA02();

	/**
	 * Returns the value of the '<em><b>A10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A10</em>' attribute.
	 * @see #isSetA10()
	 * @see #unsetA10()
	 * @see #setA10(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getAffineTransform_A10()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='A10'"
	 * @generated
	 */
	float getA10();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA10 <em>A10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A10</em>' attribute.
	 * @see #isSetA10()
	 * @see #unsetA10()
	 * @see #getA10()
	 * @generated
	 */
	void setA10(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA10 <em>A10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetA10()
	 * @see #getA10()
	 * @see #setA10(float)
	 * @generated
	 */
	void unsetA10();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA10 <em>A10</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>A10</em>' attribute is set.
	 * @see #unsetA10()
	 * @see #getA10()
	 * @see #setA10(float)
	 * @generated
	 */
	boolean isSetA10();

	/**
	 * Returns the value of the '<em><b>A11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A11</em>' attribute.
	 * @see #isSetA11()
	 * @see #unsetA11()
	 * @see #setA11(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getAffineTransform_A11()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='A11'"
	 * @generated
	 */
	float getA11();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA11 <em>A11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A11</em>' attribute.
	 * @see #isSetA11()
	 * @see #unsetA11()
	 * @see #getA11()
	 * @generated
	 */
	void setA11(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA11 <em>A11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetA11()
	 * @see #getA11()
	 * @see #setA11(float)
	 * @generated
	 */
	void unsetA11();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA11 <em>A11</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>A11</em>' attribute is set.
	 * @see #unsetA11()
	 * @see #getA11()
	 * @see #setA11(float)
	 * @generated
	 */
	boolean isSetA11();

	/**
	 * Returns the value of the '<em><b>A12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A12</em>' attribute.
	 * @see #isSetA12()
	 * @see #unsetA12()
	 * @see #setA12(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getAffineTransform_A12()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='A12'"
	 * @generated
	 */
	float getA12();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA12 <em>A12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A12</em>' attribute.
	 * @see #isSetA12()
	 * @see #unsetA12()
	 * @see #getA12()
	 * @generated
	 */
	void setA12(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA12 <em>A12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetA12()
	 * @see #getA12()
	 * @see #setA12(float)
	 * @generated
	 */
	void unsetA12();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.AffineTransform#getA12 <em>A12</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>A12</em>' attribute is set.
	 * @see #unsetA12()
	 * @see #getA12()
	 * @see #setA12(float)
	 * @generated
	 */
	boolean isSetA12();

} // AffineTransform
