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
 * A representation of the model object '<em><b>Stage Label Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.StageLabelType#getName <em>Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StageLabelType#getX <em>X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StageLabelType#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StageLabelType#getY <em>Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StageLabelType#getYUnit <em>YUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StageLabelType#getZ <em>Z</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StageLabelType#getZUnit <em>ZUnit</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getStageLabelType()
 * @model extendedMetaData="name='StageLabel_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface StageLabelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getStageLabelType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The X position of the stage label. Units are set by XUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getStageLabelType_X()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='X'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.StageLabelType#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>XUnit</b></em>' attribute.
	 * The default value is <code>"reference frame"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the X stage position - default:[reference frame].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetXUnit()
	 * @see #unsetXUnit()
	 * @see #setXUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getStageLabelType_XUnit()
	 * @model default="reference frame" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='XUnit'"
	 * @generated
	 */
	UnitsLength getXUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getXUnit <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetXUnit()
	 * @see #unsetXUnit()
	 * @see #getXUnit()
	 * @generated
	 */
	void setXUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getXUnit <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXUnit()
	 * @see #getXUnit()
	 * @see #setXUnit(UnitsLength)
	 * @generated
	 */
	void unsetXUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.StageLabelType#getXUnit <em>XUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XUnit</em>' attribute is set.
	 * @see #unsetXUnit()
	 * @see #getXUnit()
	 * @see #setXUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetXUnit();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The Y position of the stage label. Units are set by YUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getStageLabelType_Y()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Y'"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(float)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.StageLabelType#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(float)
	 * @generated
	 */
	boolean isSetY();

	/**
	 * Returns the value of the '<em><b>YUnit</b></em>' attribute.
	 * The default value is <code>"reference frame"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the Y stage position - default:[reference frame].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetYUnit()
	 * @see #unsetYUnit()
	 * @see #setYUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getStageLabelType_YUnit()
	 * @model default="reference frame" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='YUnit'"
	 * @generated
	 */
	UnitsLength getYUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getYUnit <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetYUnit()
	 * @see #unsetYUnit()
	 * @see #getYUnit()
	 * @generated
	 */
	void setYUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getYUnit <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYUnit()
	 * @see #getYUnit()
	 * @see #setYUnit(UnitsLength)
	 * @generated
	 */
	void unsetYUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.StageLabelType#getYUnit <em>YUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YUnit</em>' attribute is set.
	 * @see #unsetYUnit()
	 * @see #getYUnit()
	 * @see #setYUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetYUnit();

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The Z position of the stage label. Units are set by ZUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #isSetZ()
	 * @see #unsetZ()
	 * @see #setZ(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getStageLabelType_Z()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Z'"
	 * @generated
	 */
	float getZ();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #isSetZ()
	 * @see #unsetZ()
	 * @see #getZ()
	 * @generated
	 */
	void setZ(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZ()
	 * @see #getZ()
	 * @see #setZ(float)
	 * @generated
	 */
	void unsetZ();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.StageLabelType#getZ <em>Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Z</em>' attribute is set.
	 * @see #unsetZ()
	 * @see #getZ()
	 * @see #setZ(float)
	 * @generated
	 */
	boolean isSetZ();

	/**
	 * Returns the value of the '<em><b>ZUnit</b></em>' attribute.
	 * The default value is <code>"reference frame"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the Z  stage position - default:[reference frame].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetZUnit()
	 * @see #unsetZUnit()
	 * @see #setZUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getStageLabelType_ZUnit()
	 * @model default="reference frame" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ZUnit'"
	 * @generated
	 */
	UnitsLength getZUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getZUnit <em>ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetZUnit()
	 * @see #unsetZUnit()
	 * @see #getZUnit()
	 * @generated
	 */
	void setZUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.StageLabelType#getZUnit <em>ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZUnit()
	 * @see #getZUnit()
	 * @see #setZUnit(UnitsLength)
	 * @generated
	 */
	void unsetZUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.StageLabelType#getZUnit <em>ZUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ZUnit</em>' attribute is set.
	 * @see #unsetZUnit()
	 * @see #getZUnit()
	 * @see #setZUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetZUnit();

} // StageLabelType
