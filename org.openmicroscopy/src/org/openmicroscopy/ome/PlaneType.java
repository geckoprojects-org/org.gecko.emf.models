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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getHashSHA1 <em>Hash SHA1</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getDeltaT <em>Delta T</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getDeltaTUnit <em>Delta TUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getExposureTime <em>Exposure Time</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getExposureTimeUnit <em>Exposure Time Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getPositionX <em>Position X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getPositionXUnit <em>Position XUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getPositionYUnit <em>Position YUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getPositionZUnit <em>Position ZUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getTheC <em>The C</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getTheT <em>The T</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlaneType#getTheZ <em>The Z</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType()
 * @model extendedMetaData="name='Plane_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PlaneType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hash SHA1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash SHA1</em>' attribute.
	 * @see #setHashSHA1(byte[])
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_HashSHA1()
	 * @model dataType="org.openmicroscopy.ome.Hex40"
	 *        extendedMetaData="kind='element' name='HashSHA1' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getHashSHA1();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getHashSHA1 <em>Hash SHA1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash SHA1</em>' attribute.
	 * @see #getHashSHA1()
	 * @generated
	 */
	void setHashSHA1(byte[] value);

	/**
	 * Returns the value of the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.AnnotationRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The AnnotationRef element is a reference to an element derived
	 *         from the CommonAnnotation element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>Delta T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Time since the beginning of the experiment.
	 *             Units are set by DeltaTUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta T</em>' attribute.
	 * @see #isSetDeltaT()
	 * @see #unsetDeltaT()
	 * @see #setDeltaT(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_DeltaT()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='DeltaT'"
	 * @generated
	 */
	float getDeltaT();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getDeltaT <em>Delta T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta T</em>' attribute.
	 * @see #isSetDeltaT()
	 * @see #unsetDeltaT()
	 * @see #getDeltaT()
	 * @generated
	 */
	void setDeltaT(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getDeltaT <em>Delta T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT()
	 * @see #getDeltaT()
	 * @see #setDeltaT(float)
	 * @generated
	 */
	void unsetDeltaT();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getDeltaT <em>Delta T</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta T</em>' attribute is set.
	 * @see #unsetDeltaT()
	 * @see #getDeltaT()
	 * @see #setDeltaT(float)
	 * @generated
	 */
	boolean isSetDeltaT();

	/**
	 * Returns the value of the '<em><b>Delta TUnit</b></em>' attribute.
	 * The default value is <code>"s"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the DeltaT - default:seconds[s].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta TUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsTime
	 * @see #isSetDeltaTUnit()
	 * @see #unsetDeltaTUnit()
	 * @see #setDeltaTUnit(UnitsTime)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_DeltaTUnit()
	 * @model default="s" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='DeltaTUnit'"
	 * @generated
	 */
	UnitsTime getDeltaTUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getDeltaTUnit <em>Delta TUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsTime
	 * @see #isSetDeltaTUnit()
	 * @see #unsetDeltaTUnit()
	 * @see #getDeltaTUnit()
	 * @generated
	 */
	void setDeltaTUnit(UnitsTime value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getDeltaTUnit <em>Delta TUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaTUnit()
	 * @see #getDeltaTUnit()
	 * @see #setDeltaTUnit(UnitsTime)
	 * @generated
	 */
	void unsetDeltaTUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getDeltaTUnit <em>Delta TUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TUnit</em>' attribute is set.
	 * @see #unsetDeltaTUnit()
	 * @see #getDeltaTUnit()
	 * @see #setDeltaTUnit(UnitsTime)
	 * @generated
	 */
	boolean isSetDeltaTUnit();

	/**
	 * Returns the value of the '<em><b>Exposure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The length of the exposure.
	 *             Units are set by ExposureTimeUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposure Time</em>' attribute.
	 * @see #isSetExposureTime()
	 * @see #unsetExposureTime()
	 * @see #setExposureTime(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_ExposureTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='ExposureTime'"
	 * @generated
	 */
	float getExposureTime();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getExposureTime <em>Exposure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Time</em>' attribute.
	 * @see #isSetExposureTime()
	 * @see #unsetExposureTime()
	 * @see #getExposureTime()
	 * @generated
	 */
	void setExposureTime(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getExposureTime <em>Exposure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExposureTime()
	 * @see #getExposureTime()
	 * @see #setExposureTime(float)
	 * @generated
	 */
	void unsetExposureTime();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getExposureTime <em>Exposure Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exposure Time</em>' attribute is set.
	 * @see #unsetExposureTime()
	 * @see #getExposureTime()
	 * @see #setExposureTime(float)
	 * @generated
	 */
	boolean isSetExposureTime();

	/**
	 * Returns the value of the '<em><b>Exposure Time Unit</b></em>' attribute.
	 * The default value is <code>"s"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the ExposureTime - default:seconds[s].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposure Time Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsTime
	 * @see #isSetExposureTimeUnit()
	 * @see #unsetExposureTimeUnit()
	 * @see #setExposureTimeUnit(UnitsTime)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_ExposureTimeUnit()
	 * @model default="s" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ExposureTimeUnit'"
	 * @generated
	 */
	UnitsTime getExposureTimeUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getExposureTimeUnit <em>Exposure Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Time Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsTime
	 * @see #isSetExposureTimeUnit()
	 * @see #unsetExposureTimeUnit()
	 * @see #getExposureTimeUnit()
	 * @generated
	 */
	void setExposureTimeUnit(UnitsTime value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getExposureTimeUnit <em>Exposure Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExposureTimeUnit()
	 * @see #getExposureTimeUnit()
	 * @see #setExposureTimeUnit(UnitsTime)
	 * @generated
	 */
	void unsetExposureTimeUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getExposureTimeUnit <em>Exposure Time Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exposure Time Unit</em>' attribute is set.
	 * @see #unsetExposureTimeUnit()
	 * @see #getExposureTimeUnit()
	 * @see #setExposureTimeUnit(UnitsTime)
	 * @generated
	 */
	boolean isSetExposureTimeUnit();

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The X position of the stage. Units are set by PositionXUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position X</em>' attribute.
	 * @see #isSetPositionX()
	 * @see #unsetPositionX()
	 * @see #setPositionX(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_PositionX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='PositionX'"
	 * @generated
	 */
	float getPositionX();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionX <em>Position X</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionX <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositionX()
	 * @see #getPositionX()
	 * @see #setPositionX(float)
	 * @generated
	 */
	void unsetPositionX();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionX <em>Position X</em>}' attribute is set.
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
	 * The units of the X stage position - default:[reference frame].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position XUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPositionXUnit()
	 * @see #unsetPositionXUnit()
	 * @see #setPositionXUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_PositionXUnit()
	 * @model default="reference frame" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PositionXUnit'"
	 * @generated
	 */
	UnitsLength getPositionXUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionXUnit <em>Position XUnit</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionXUnit <em>Position XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositionXUnit()
	 * @see #getPositionXUnit()
	 * @see #setPositionXUnit(UnitsLength)
	 * @generated
	 */
	void unsetPositionXUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionXUnit <em>Position XUnit</em>}' attribute is set.
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
	 *             The Y position of the stage. Units are set by PositionYUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Y</em>' attribute.
	 * @see #isSetPositionY()
	 * @see #unsetPositionY()
	 * @see #setPositionY(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_PositionY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='PositionY'"
	 * @generated
	 */
	float getPositionY();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionY <em>Position Y</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionY <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositionY()
	 * @see #getPositionY()
	 * @see #setPositionY(float)
	 * @generated
	 */
	void unsetPositionY();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionY <em>Position Y</em>}' attribute is set.
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
	 * The units of the Y stage position - default:[reference frame].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position YUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPositionYUnit()
	 * @see #unsetPositionYUnit()
	 * @see #setPositionYUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_PositionYUnit()
	 * @model default="reference frame" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PositionYUnit'"
	 * @generated
	 */
	UnitsLength getPositionYUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionYUnit <em>Position YUnit</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionYUnit <em>Position YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositionYUnit()
	 * @see #getPositionYUnit()
	 * @see #setPositionYUnit(UnitsLength)
	 * @generated
	 */
	void unsetPositionYUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionYUnit <em>Position YUnit</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The Z position of the stage. Units are set by PositionZUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Z</em>' attribute.
	 * @see #isSetPositionZ()
	 * @see #unsetPositionZ()
	 * @see #setPositionZ(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_PositionZ()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='PositionZ'"
	 * @generated
	 */
	float getPositionZ();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionZ <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Z</em>' attribute.
	 * @see #isSetPositionZ()
	 * @see #unsetPositionZ()
	 * @see #getPositionZ()
	 * @generated
	 */
	void setPositionZ(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionZ <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositionZ()
	 * @see #getPositionZ()
	 * @see #setPositionZ(float)
	 * @generated
	 */
	void unsetPositionZ();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionZ <em>Position Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position Z</em>' attribute is set.
	 * @see #unsetPositionZ()
	 * @see #getPositionZ()
	 * @see #setPositionZ(float)
	 * @generated
	 */
	boolean isSetPositionZ();

	/**
	 * Returns the value of the '<em><b>Position ZUnit</b></em>' attribute.
	 * The default value is <code>"reference frame"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the Z stage position - default:[reference frame].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position ZUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPositionZUnit()
	 * @see #unsetPositionZUnit()
	 * @see #setPositionZUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_PositionZUnit()
	 * @model default="reference frame" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PositionZUnit'"
	 * @generated
	 */
	UnitsLength getPositionZUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionZUnit <em>Position ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position ZUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPositionZUnit()
	 * @see #unsetPositionZUnit()
	 * @see #getPositionZUnit()
	 * @generated
	 */
	void setPositionZUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionZUnit <em>Position ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositionZUnit()
	 * @see #getPositionZUnit()
	 * @see #setPositionZUnit(UnitsLength)
	 * @generated
	 */
	void unsetPositionZUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getPositionZUnit <em>Position ZUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position ZUnit</em>' attribute is set.
	 * @see #unsetPositionZUnit()
	 * @see #getPositionZUnit()
	 * @see #setPositionZUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetPositionZUnit();

	/**
	 * Returns the value of the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The channel this plane is for. [units:none]
	 *             This is numbered from 0.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>The C</em>' attribute.
	 * @see #isSetTheC()
	 * @see #unsetTheC()
	 * @see #setTheC(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_TheC()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt" required="true"
	 *        extendedMetaData="kind='attribute' name='TheC'"
	 * @generated
	 */
	int getTheC();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getTheC <em>The C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The C</em>' attribute.
	 * @see #isSetTheC()
	 * @see #unsetTheC()
	 * @see #getTheC()
	 * @generated
	 */
	void setTheC(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getTheC <em>The C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheC()
	 * @see #getTheC()
	 * @see #setTheC(int)
	 * @generated
	 */
	void unsetTheC();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getTheC <em>The C</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The C</em>' attribute is set.
	 * @see #unsetTheC()
	 * @see #getTheC()
	 * @see #setTheC(int)
	 * @generated
	 */
	boolean isSetTheC();

	/**
	 * Returns the value of the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The timepoint this plane is for. [units:none]
	 *             This is numbered from 0.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>The T</em>' attribute.
	 * @see #isSetTheT()
	 * @see #unsetTheT()
	 * @see #setTheT(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_TheT()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt" required="true"
	 *        extendedMetaData="kind='attribute' name='TheT'"
	 * @generated
	 */
	int getTheT();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getTheT <em>The T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The T</em>' attribute.
	 * @see #isSetTheT()
	 * @see #unsetTheT()
	 * @see #getTheT()
	 * @generated
	 */
	void setTheT(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getTheT <em>The T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheT()
	 * @see #getTheT()
	 * @see #setTheT(int)
	 * @generated
	 */
	void unsetTheT();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getTheT <em>The T</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The T</em>' attribute is set.
	 * @see #unsetTheT()
	 * @see #getTheT()
	 * @see #setTheT(int)
	 * @generated
	 */
	boolean isSetTheT();

	/**
	 * Returns the value of the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The Z-section this plane is for. [units:none]
	 *             This is numbered from 0.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>The Z</em>' attribute.
	 * @see #isSetTheZ()
	 * @see #unsetTheZ()
	 * @see #setTheZ(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlaneType_TheZ()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt" required="true"
	 *        extendedMetaData="kind='attribute' name='TheZ'"
	 * @generated
	 */
	int getTheZ();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlaneType#getTheZ <em>The Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Z</em>' attribute.
	 * @see #isSetTheZ()
	 * @see #unsetTheZ()
	 * @see #getTheZ()
	 * @generated
	 */
	void setTheZ(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlaneType#getTheZ <em>The Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheZ()
	 * @see #getTheZ()
	 * @see #setTheZ(int)
	 * @generated
	 */
	void unsetTheZ();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlaneType#getTheZ <em>The Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The Z</em>' attribute is set.
	 * @see #unsetTheZ()
	 * @see #getTheZ()
	 * @see #setTheZ(int)
	 * @generated
	 */
	boolean isSetTheZ();

} // PlaneType
