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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Well Sample Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.WellSampleType#getImageRef <em>Image Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellSampleType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellSampleType#getIndex <em>Index</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellSampleType#getPositionX <em>Position X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellSampleType#getPositionXUnit <em>Position XUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellSampleType#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellSampleType#getPositionYUnit <em>Position YUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellSampleType#getTimepoint <em>Timepoint</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getWellSampleType()
 * @model extendedMetaData="name='WellSample_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WellSampleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               This is the main link to the core Image element
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Ref</em>' containment reference.
	 * @see #setImageRef(ImageRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellSampleType_ImageRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageRefType getImageRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getImageRef <em>Image Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Ref</em>' containment reference.
	 * @see #getImageRef()
	 * @generated
	 */
	void setImageRef(ImageRefType value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellSampleType_ID()
	 * @model dataType="org.openmicroscopy.ome.WellSampleID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This records the order of the well samples. Each
	 *             index should be unique for a given plate but they do not
	 *             have to be sequential, there may be gaps if part of the
	 *             dataset is missing. In the user interface the displayed
	 *             value of the index will be calculated modulo the number
	 *             of PlateAcquisitions for the plate.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #isSetIndex()
	 * @see #unsetIndex()
	 * @see #setIndex(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellSampleType_Index()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt" required="true"
	 *        extendedMetaData="kind='attribute' name='Index'"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #isSetIndex()
	 * @see #unsetIndex()
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndex()
	 * @see #getIndex()
	 * @see #setIndex(int)
	 * @generated
	 */
	void unsetIndex();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.WellSampleType#getIndex <em>Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index</em>' attribute is set.
	 * @see #unsetIndex()
	 * @see #getIndex()
	 * @see #setIndex(int)
	 * @generated
	 */
	boolean isSetIndex();

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The X position of the field (image) within the well relative to
	 *             the well origin defined on the Plate. Units are set by PositionXUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position X</em>' attribute.
	 * @see #isSetPositionX()
	 * @see #unsetPositionX()
	 * @see #setPositionX(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellSampleType_PositionX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='PositionX'"
	 * @generated
	 */
	float getPositionX();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionX <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' attribute.
	 * @see #isSetPositionX()
	 * @see #unsetPositionX()
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionX <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositionX()
	 * @see #getPositionX()
	 * @see #setPositionX(float)
	 * @generated
	 */
	void unsetPositionX();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionX <em>Position X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position X</em>' attribute is set.
	 * @see #unsetPositionX()
	 * @see #getPositionX()
	 * @see #setPositionX(float)
	 * @generated
	 */
	boolean isSetPositionX();

	/**
	 * Returns the value of the '<em><b>Position XUnit</b></em>' attribute.
	 * The default value is <code>"reference frame"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the position in X - default:reference frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position XUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPositionXUnit()
	 * @see #unsetPositionXUnit()
	 * @see #setPositionXUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellSampleType_PositionXUnit()
	 * @model default="reference frame" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PositionXUnit'"
	 * @generated
	 */
	UnitsLength getPositionXUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionXUnit <em>Position XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPositionXUnit()
	 * @see #unsetPositionXUnit()
	 * @see #getPositionXUnit()
	 * @generated
	 */
	void setPositionXUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionXUnit <em>Position XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositionXUnit()
	 * @see #getPositionXUnit()
	 * @see #setPositionXUnit(UnitsLength)
	 * @generated
	 */
	void unsetPositionXUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionXUnit <em>Position XUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position XUnit</em>' attribute is set.
	 * @see #unsetPositionXUnit()
	 * @see #getPositionXUnit()
	 * @see #setPositionXUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetPositionXUnit();

	/**
	 * Returns the value of the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The Y position of the field (image) within the well relative to
	 *             the well origin defined on the Plate. Units are set by PositionYUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Y</em>' attribute.
	 * @see #isSetPositionY()
	 * @see #unsetPositionY()
	 * @see #setPositionY(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellSampleType_PositionY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='PositionY'"
	 * @generated
	 */
	float getPositionY();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionY <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Y</em>' attribute.
	 * @see #isSetPositionY()
	 * @see #unsetPositionY()
	 * @see #getPositionY()
	 * @generated
	 */
	void setPositionY(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionY <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositionY()
	 * @see #getPositionY()
	 * @see #setPositionY(float)
	 * @generated
	 */
	void unsetPositionY();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionY <em>Position Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position Y</em>' attribute is set.
	 * @see #unsetPositionY()
	 * @see #getPositionY()
	 * @see #setPositionY(float)
	 * @generated
	 */
	boolean isSetPositionY();

	/**
	 * Returns the value of the '<em><b>Position YUnit</b></em>' attribute.
	 * The default value is <code>"reference frame"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the position in Y - default:reference frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position YUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPositionYUnit()
	 * @see #unsetPositionYUnit()
	 * @see #setPositionYUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellSampleType_PositionYUnit()
	 * @model default="reference frame" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PositionYUnit'"
	 * @generated
	 */
	UnitsLength getPositionYUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionYUnit <em>Position YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position YUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPositionYUnit()
	 * @see #unsetPositionYUnit()
	 * @see #getPositionYUnit()
	 * @generated
	 */
	void setPositionYUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionYUnit <em>Position YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositionYUnit()
	 * @see #getPositionYUnit()
	 * @see #setPositionYUnit(UnitsLength)
	 * @generated
	 */
	void unsetPositionYUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.WellSampleType#getPositionYUnit <em>Position YUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position YUnit</em>' attribute is set.
	 * @see #unsetPositionYUnit()
	 * @see #getPositionYUnit()
	 * @see #setPositionYUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetPositionYUnit();

	/**
	 * Returns the value of the '<em><b>Timepoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The time-point at which the image started to be collected
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timepoint</em>' attribute.
	 * @see #setTimepoint(XMLGregorianCalendar)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellSampleType_Timepoint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='Timepoint'"
	 * @generated
	 */
	XMLGregorianCalendar getTimepoint();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellSampleType#getTimepoint <em>Timepoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timepoint</em>' attribute.
	 * @see #getTimepoint()
	 * @generated
	 */
	void setTimepoint(XMLGregorianCalendar value);

} // WellSampleType
