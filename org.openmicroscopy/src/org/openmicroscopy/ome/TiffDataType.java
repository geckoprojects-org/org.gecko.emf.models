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
 * A representation of the model object '<em><b>Tiff Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.TiffDataType#getUUID <em>UUID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TiffDataType#getFirstC <em>First C</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TiffDataType#getFirstT <em>First T</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TiffDataType#getFirstZ <em>First Z</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TiffDataType#getIFD <em>IFD</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TiffDataType#getPlaneCount <em>Plane Count</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getTiffDataType()
 * @model extendedMetaData="name='TiffData_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TiffDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>UUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               This must be used when the IFDs are located in another file.
	 *               Note: It is permissible for this to be self referential.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UUID</em>' containment reference.
	 * @see #setUUID(UUIDType)
	 * @see org.openmicroscopy.ome.OMEPackage#getTiffDataType_UUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UUID' namespace='##targetNamespace'"
	 * @generated
	 */
	UUIDType getUUID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getUUID <em>UUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' containment reference.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(UUIDType value);

	/**
	 * Returns the value of the '<em><b>First C</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Gives the C position of the image plane at the specified IFD. Indexed from 0.
	 *             Default is 0 (the first C position). [units:none]
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First C</em>' attribute.
	 * @see #isSetFirstC()
	 * @see #unsetFirstC()
	 * @see #setFirstC(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getTiffDataType_FirstC()
	 * @model default="0" unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt"
	 *        extendedMetaData="kind='attribute' name='FirstC'"
	 * @generated
	 */
	int getFirstC();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getFirstC <em>First C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First C</em>' attribute.
	 * @see #isSetFirstC()
	 * @see #unsetFirstC()
	 * @see #getFirstC()
	 * @generated
	 */
	void setFirstC(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getFirstC <em>First C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstC()
	 * @see #getFirstC()
	 * @see #setFirstC(int)
	 * @generated
	 */
	void unsetFirstC();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TiffDataType#getFirstC <em>First C</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First C</em>' attribute is set.
	 * @see #unsetFirstC()
	 * @see #getFirstC()
	 * @see #setFirstC(int)
	 * @generated
	 */
	boolean isSetFirstC();

	/**
	 * Returns the value of the '<em><b>First T</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Gives the T position of the image plane at the specified IFD. Indexed from 0.
	 *             Default is 0 (the first T position). [units:none]
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First T</em>' attribute.
	 * @see #isSetFirstT()
	 * @see #unsetFirstT()
	 * @see #setFirstT(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getTiffDataType_FirstT()
	 * @model default="0" unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt"
	 *        extendedMetaData="kind='attribute' name='FirstT'"
	 * @generated
	 */
	int getFirstT();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getFirstT <em>First T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First T</em>' attribute.
	 * @see #isSetFirstT()
	 * @see #unsetFirstT()
	 * @see #getFirstT()
	 * @generated
	 */
	void setFirstT(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getFirstT <em>First T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstT()
	 * @see #getFirstT()
	 * @see #setFirstT(int)
	 * @generated
	 */
	void unsetFirstT();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TiffDataType#getFirstT <em>First T</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First T</em>' attribute is set.
	 * @see #unsetFirstT()
	 * @see #getFirstT()
	 * @see #setFirstT(int)
	 * @generated
	 */
	boolean isSetFirstT();

	/**
	 * Returns the value of the '<em><b>First Z</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Gives the Z position of the image plane at the specified IFD. Indexed from 0.
	 *             Default is 0 (the first Z position). [units:none]
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Z</em>' attribute.
	 * @see #isSetFirstZ()
	 * @see #unsetFirstZ()
	 * @see #setFirstZ(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getTiffDataType_FirstZ()
	 * @model default="0" unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt"
	 *        extendedMetaData="kind='attribute' name='FirstZ'"
	 * @generated
	 */
	int getFirstZ();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getFirstZ <em>First Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Z</em>' attribute.
	 * @see #isSetFirstZ()
	 * @see #unsetFirstZ()
	 * @see #getFirstZ()
	 * @generated
	 */
	void setFirstZ(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getFirstZ <em>First Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstZ()
	 * @see #getFirstZ()
	 * @see #setFirstZ(int)
	 * @generated
	 */
	void unsetFirstZ();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TiffDataType#getFirstZ <em>First Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Z</em>' attribute is set.
	 * @see #unsetFirstZ()
	 * @see #getFirstZ()
	 * @see #setFirstZ(int)
	 * @generated
	 */
	boolean isSetFirstZ();

	/**
	 * Returns the value of the '<em><b>IFD</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Gives the IFD(s) for which this element is applicable. Indexed from 0.
	 *             Default is 0 (the first IFD). [units:none]
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IFD</em>' attribute.
	 * @see #isSetIFD()
	 * @see #unsetIFD()
	 * @see #setIFD(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getTiffDataType_IFD()
	 * @model default="0" unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt"
	 *        extendedMetaData="kind='attribute' name='IFD'"
	 * @generated
	 */
	int getIFD();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getIFD <em>IFD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IFD</em>' attribute.
	 * @see #isSetIFD()
	 * @see #unsetIFD()
	 * @see #getIFD()
	 * @generated
	 */
	void setIFD(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getIFD <em>IFD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIFD()
	 * @see #getIFD()
	 * @see #setIFD(int)
	 * @generated
	 */
	void unsetIFD();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TiffDataType#getIFD <em>IFD</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IFD</em>' attribute is set.
	 * @see #unsetIFD()
	 * @see #getIFD()
	 * @see #setIFD(int)
	 * @generated
	 */
	boolean isSetIFD();

	/**
	 * Returns the value of the '<em><b>Plane Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Gives the number of IFDs affected. Dimension order of IFDs is given by the enclosing
	 *             Pixels element's DimensionOrder attribute. Default is the number of IFDs in the TIFF
	 *             file, unless an IFD is specified, in which case the default is 1. [units:none]
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plane Count</em>' attribute.
	 * @see #isSetPlaneCount()
	 * @see #unsetPlaneCount()
	 * @see #setPlaneCount(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getTiffDataType_PlaneCount()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt"
	 *        extendedMetaData="kind='attribute' name='PlaneCount'"
	 * @generated
	 */
	int getPlaneCount();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getPlaneCount <em>Plane Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane Count</em>' attribute.
	 * @see #isSetPlaneCount()
	 * @see #unsetPlaneCount()
	 * @see #getPlaneCount()
	 * @generated
	 */
	void setPlaneCount(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TiffDataType#getPlaneCount <em>Plane Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlaneCount()
	 * @see #getPlaneCount()
	 * @see #setPlaneCount(int)
	 * @generated
	 */
	void unsetPlaneCount();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TiffDataType#getPlaneCount <em>Plane Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plane Count</em>' attribute is set.
	 * @see #unsetPlaneCount()
	 * @see #getPlaneCount()
	 * @see #setPlaneCount(int)
	 * @generated
	 */
	boolean isSetPlaneCount();

} // TiffDataType
