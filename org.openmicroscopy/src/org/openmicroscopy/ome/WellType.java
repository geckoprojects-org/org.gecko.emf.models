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
 * A representation of the model object '<em><b>Well Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.WellType#getWellSample <em>Well Sample</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellType#getReagentRef <em>Reagent Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellType#getColor <em>Color</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellType#getColumn <em>Column</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellType#getExternalDescription <em>External Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellType#getExternalIdentifier <em>External Identifier</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellType#getRow <em>Row</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.WellType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getWellType()
 * @model extendedMetaData="name='Well_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WellType extends EObject {
	/**
	 * Returns the value of the '<em><b>Well Sample</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.WellSampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         WellSample is an individual image that has been captured within a Well.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Well Sample</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getWellType_WellSample()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WellSample' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WellSampleType> getWellSample();

	/**
	 * Returns the value of the '<em><b>Reagent Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reagent Ref</em>' containment reference.
	 * @see #setReagentRef(ReagentRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellType_ReagentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReagentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ReagentRefType getReagentRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellType#getReagentRef <em>Reagent Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reagent Ref</em>' containment reference.
	 * @see #getReagentRef()
	 * @generated
	 */
	void setReagentRef(ReagentRefType value);

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
	 * @see org.openmicroscopy.ome.OMEPackage#getWellType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A marker color used to highlight the well - encoded as RGBA
	 *             The default value "-1" is #FFFFFFFF so solid white (it is a signed 32 bit value)
	 *             NOTE: Prior to the 2012-06 schema the default value was incorrect and produced a transparent red not solid white.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #setColor(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellType_Color()
	 * @model default="-1" unsettable="true" dataType="org.openmicroscopy.ome.Color"
	 *        extendedMetaData="kind='attribute' name='Color'"
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.WellType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColor()
	 * @see #getColor()
	 * @see #setColor(int)
	 * @generated
	 */
	void unsetColor();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.WellType#getColor <em>Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color</em>' attribute is set.
	 * @see #unsetColor()
	 * @see #getColor()
	 * @see #setColor(int)
	 * @generated
	 */
	boolean isSetColor();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This is the column index of the well, the origin is the top left corner of the plate
	 *             with the first column of cells being column zero. i.e top left is (0,0)
	 *             The combination of Row, Column has to be unique for each well in a plate.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #isSetColumn()
	 * @see #unsetColumn()
	 * @see #setColumn(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellType_Column()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt" required="true"
	 *        extendedMetaData="kind='attribute' name='Column'"
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellType#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #isSetColumn()
	 * @see #unsetColumn()
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.WellType#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColumn()
	 * @see #getColumn()
	 * @see #setColumn(int)
	 * @generated
	 */
	void unsetColumn();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.WellType#getColumn <em>Column</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Column</em>' attribute is set.
	 * @see #unsetColumn()
	 * @see #getColumn()
	 * @see #setColumn(int)
	 * @generated
	 */
	boolean isSetColumn();

	/**
	 * Returns the value of the '<em><b>External Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A description of the externally defined identifier for this plate.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Description</em>' attribute.
	 * @see #setExternalDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellType_ExternalDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExternalDescription'"
	 * @generated
	 */
	String getExternalDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellType#getExternalDescription <em>External Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Description</em>' attribute.
	 * @see #getExternalDescription()
	 * @generated
	 */
	void setExternalDescription(String value);

	/**
	 * Returns the value of the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The ExternalIdentifier attribute may contain a reference to an external database.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Identifier</em>' attribute.
	 * @see #setExternalIdentifier(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellType_ExternalIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExternalIdentifier'"
	 * @generated
	 */
	String getExternalIdentifier();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellType#getExternalIdentifier <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Identifier</em>' attribute.
	 * @see #getExternalIdentifier()
	 * @generated
	 */
	void setExternalIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellType_ID()
	 * @model dataType="org.openmicroscopy.ome.WellID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This is the row index of the well, the origin is the top left corner of the plate
	 *             with the first row of wells being row zero. i.e top left is (0,0)
	 *             The combination of Row, Column has to be unique for each well in a plate.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #isSetRow()
	 * @see #unsetRow()
	 * @see #setRow(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellType_Row()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt" required="true"
	 *        extendedMetaData="kind='attribute' name='Row'"
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellType#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #isSetRow()
	 * @see #unsetRow()
	 * @see #getRow()
	 * @generated
	 */
	void setRow(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.WellType#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRow()
	 * @see #getRow()
	 * @see #setRow(int)
	 * @generated
	 */
	void unsetRow();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.WellType#getRow <em>Row</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Row</em>' attribute is set.
	 * @see #unsetRow()
	 * @see #getRow()
	 * @see #setRow(int)
	 * @generated
	 */
	boolean isSetRow();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A human readable identifier for the screening status.
	 *             e.g. empty, positive control, negative control, control, experimental, etc.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getWellType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.WellType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // WellType
