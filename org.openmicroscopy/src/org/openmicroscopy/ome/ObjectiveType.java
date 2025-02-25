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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveType#getCalibratedMagnification <em>Calibrated Magnification</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveType#getCorrection <em>Correction</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveType#getImmersion <em>Immersion</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveType#isIris <em>Iris</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveType#getLensNA <em>Lens NA</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveType#getNominalMagnification <em>Nominal Magnification</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveType#getWorkingDistance <em>Working Distance</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveType#getWorkingDistanceUnit <em>Working Distance Unit</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType()
 * @model extendedMetaData="name='Objective_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ObjectiveType extends ManufacturerSpec {
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
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>Calibrated Magnification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The magnification of the lens as measured by a calibration process- i.e. '59.987' for a 60X lens. [units:none]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calibrated Magnification</em>' attribute.
	 * @see #isSetCalibratedMagnification()
	 * @see #unsetCalibratedMagnification()
	 * @see #setCalibratedMagnification(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType_CalibratedMagnification()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='CalibratedMagnification'"
	 * @generated
	 */
	float getCalibratedMagnification();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getCalibratedMagnification <em>Calibrated Magnification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibrated Magnification</em>' attribute.
	 * @see #isSetCalibratedMagnification()
	 * @see #unsetCalibratedMagnification()
	 * @see #getCalibratedMagnification()
	 * @generated
	 */
	void setCalibratedMagnification(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getCalibratedMagnification <em>Calibrated Magnification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCalibratedMagnification()
	 * @see #getCalibratedMagnification()
	 * @see #setCalibratedMagnification(float)
	 * @generated
	 */
	void unsetCalibratedMagnification();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getCalibratedMagnification <em>Calibrated Magnification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Calibrated Magnification</em>' attribute is set.
	 * @see #unsetCalibratedMagnification()
	 * @see #getCalibratedMagnification()
	 * @see #setCalibratedMagnification(float)
	 * @generated
	 */
	boolean isSetCalibratedMagnification();

	/**
	 * Returns the value of the '<em><b>Correction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.CorrectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The correction applied to the lens
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correction</em>' attribute.
	 * @see org.openmicroscopy.ome.CorrectionType
	 * @see #isSetCorrection()
	 * @see #unsetCorrection()
	 * @see #setCorrection(CorrectionType)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType_Correction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Correction'"
	 * @generated
	 */
	CorrectionType getCorrection();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getCorrection <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correction</em>' attribute.
	 * @see org.openmicroscopy.ome.CorrectionType
	 * @see #isSetCorrection()
	 * @see #unsetCorrection()
	 * @see #getCorrection()
	 * @generated
	 */
	void setCorrection(CorrectionType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getCorrection <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCorrection()
	 * @see #getCorrection()
	 * @see #setCorrection(CorrectionType)
	 * @generated
	 */
	void unsetCorrection();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getCorrection <em>Correction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Correction</em>' attribute is set.
	 * @see #unsetCorrection()
	 * @see #getCorrection()
	 * @see #setCorrection(CorrectionType)
	 * @generated
	 */
	boolean isSetCorrection();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType_ID()
	 * @model dataType="org.openmicroscopy.ome.ObjectiveID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Immersion</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.ImmersionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The immersion medium the lens is designed for
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immersion</em>' attribute.
	 * @see org.openmicroscopy.ome.ImmersionType
	 * @see #isSetImmersion()
	 * @see #unsetImmersion()
	 * @see #setImmersion(ImmersionType)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType_Immersion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Immersion'"
	 * @generated
	 */
	ImmersionType getImmersion();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getImmersion <em>Immersion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immersion</em>' attribute.
	 * @see org.openmicroscopy.ome.ImmersionType
	 * @see #isSetImmersion()
	 * @see #unsetImmersion()
	 * @see #getImmersion()
	 * @generated
	 */
	void setImmersion(ImmersionType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getImmersion <em>Immersion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImmersion()
	 * @see #getImmersion()
	 * @see #setImmersion(ImmersionType)
	 * @generated
	 */
	void unsetImmersion();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getImmersion <em>Immersion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Immersion</em>' attribute is set.
	 * @see #unsetImmersion()
	 * @see #getImmersion()
	 * @see #setImmersion(ImmersionType)
	 * @generated
	 */
	boolean isSetImmersion();

	/**
	 * Returns the value of the '<em><b>Iris</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Records whether or not the objective was fitted with an Iris. [flag]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iris</em>' attribute.
	 * @see #isSetIris()
	 * @see #unsetIris()
	 * @see #setIris(boolean)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType_Iris()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Iris'"
	 * @generated
	 */
	boolean isIris();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#isIris <em>Iris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iris</em>' attribute.
	 * @see #isSetIris()
	 * @see #unsetIris()
	 * @see #isIris()
	 * @generated
	 */
	void setIris(boolean value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#isIris <em>Iris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIris()
	 * @see #isIris()
	 * @see #setIris(boolean)
	 * @generated
	 */
	void unsetIris();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveType#isIris <em>Iris</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Iris</em>' attribute is set.
	 * @see #unsetIris()
	 * @see #isIris()
	 * @see #setIris(boolean)
	 * @generated
	 */
	boolean isSetIris();

	/**
	 * Returns the value of the '<em><b>Lens NA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The numerical aperture of the lens expressed as a floating point (real) number.
	 *                 Expected range 0.02 - 1.5 [units:none]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lens NA</em>' attribute.
	 * @see #isSetLensNA()
	 * @see #unsetLensNA()
	 * @see #setLensNA(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType_LensNA()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='LensNA'"
	 * @generated
	 */
	float getLensNA();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getLensNA <em>Lens NA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lens NA</em>' attribute.
	 * @see #isSetLensNA()
	 * @see #unsetLensNA()
	 * @see #getLensNA()
	 * @generated
	 */
	void setLensNA(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getLensNA <em>Lens NA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLensNA()
	 * @see #getLensNA()
	 * @see #setLensNA(float)
	 * @generated
	 */
	void unsetLensNA();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getLensNA <em>Lens NA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lens NA</em>' attribute is set.
	 * @see #unsetLensNA()
	 * @see #getLensNA()
	 * @see #setLensNA(float)
	 * @generated
	 */
	boolean isSetLensNA();

	/**
	 * Returns the value of the '<em><b>Nominal Magnification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The magnification of the lens as specified by the manufacturer - i.e. '60' is a 60X lens. [units:none]
	 *                 Note: The type of this has been changed from int to float to allow
	 *                 the specification of additional lenses e.g. 0.5X lens
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nominal Magnification</em>' attribute.
	 * @see #isSetNominalMagnification()
	 * @see #unsetNominalMagnification()
	 * @see #setNominalMagnification(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType_NominalMagnification()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='NominalMagnification'"
	 * @generated
	 */
	float getNominalMagnification();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getNominalMagnification <em>Nominal Magnification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Magnification</em>' attribute.
	 * @see #isSetNominalMagnification()
	 * @see #unsetNominalMagnification()
	 * @see #getNominalMagnification()
	 * @generated
	 */
	void setNominalMagnification(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getNominalMagnification <em>Nominal Magnification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalMagnification()
	 * @see #getNominalMagnification()
	 * @see #setNominalMagnification(float)
	 * @generated
	 */
	void unsetNominalMagnification();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getNominalMagnification <em>Nominal Magnification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Magnification</em>' attribute is set.
	 * @see #unsetNominalMagnification()
	 * @see #getNominalMagnification()
	 * @see #setNominalMagnification(float)
	 * @generated
	 */
	boolean isSetNominalMagnification();

	/**
	 * Returns the value of the '<em><b>Working Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The working distance of the lens expressed as a floating point (real) number. Units are set by WorkingDistanceUnit.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Working Distance</em>' attribute.
	 * @see #isSetWorkingDistance()
	 * @see #unsetWorkingDistance()
	 * @see #setWorkingDistance(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType_WorkingDistance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='WorkingDistance'"
	 * @generated
	 */
	float getWorkingDistance();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getWorkingDistance <em>Working Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Distance</em>' attribute.
	 * @see #isSetWorkingDistance()
	 * @see #unsetWorkingDistance()
	 * @see #getWorkingDistance()
	 * @generated
	 */
	void setWorkingDistance(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getWorkingDistance <em>Working Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkingDistance()
	 * @see #getWorkingDistance()
	 * @see #setWorkingDistance(float)
	 * @generated
	 */
	void unsetWorkingDistance();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getWorkingDistance <em>Working Distance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Working Distance</em>' attribute is set.
	 * @see #unsetWorkingDistance()
	 * @see #getWorkingDistance()
	 * @see #setWorkingDistance(float)
	 * @generated
	 */
	boolean isSetWorkingDistance();

	/**
	 * Returns the value of the '<em><b>Working Distance Unit</b></em>' attribute.
	 * The default value is <code>"\u00b5m"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the working distance - default:microns[µm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Working Distance Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetWorkingDistanceUnit()
	 * @see #unsetWorkingDistanceUnit()
	 * @see #setWorkingDistanceUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveType_WorkingDistanceUnit()
	 * @model default="\u00b5m" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='WorkingDistanceUnit'"
	 * @generated
	 */
	UnitsLength getWorkingDistanceUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getWorkingDistanceUnit <em>Working Distance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Distance Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetWorkingDistanceUnit()
	 * @see #unsetWorkingDistanceUnit()
	 * @see #getWorkingDistanceUnit()
	 * @generated
	 */
	void setWorkingDistanceUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getWorkingDistanceUnit <em>Working Distance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkingDistanceUnit()
	 * @see #getWorkingDistanceUnit()
	 * @see #setWorkingDistanceUnit(UnitsLength)
	 * @generated
	 */
	void unsetWorkingDistanceUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveType#getWorkingDistanceUnit <em>Working Distance Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Working Distance Unit</em>' attribute is set.
	 * @see #unsetWorkingDistanceUnit()
	 * @see #getWorkingDistanceUnit()
	 * @see #setWorkingDistanceUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetWorkingDistanceUnit();

} // ObjectiveType
