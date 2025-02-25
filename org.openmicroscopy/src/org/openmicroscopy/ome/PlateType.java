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
 * A representation of the model object '<em><b>Plate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getWell <em>Well</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getPlateAcquisition <em>Plate Acquisition</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getColumnNamingConvention <em>Column Naming Convention</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getExternalIdentifier <em>External Identifier</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getFieldIndex <em>Field Index</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getName <em>Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getRowNamingConvention <em>Row Naming Convention</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getRows <em>Rows</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getWellOriginX <em>Well Origin X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getWellOriginXUnit <em>Well Origin XUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getWellOriginY <em>Well Origin Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateType#getWellOriginYUnit <em>Well Origin YUnit</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getPlateType()
 * @model extendedMetaData="name='Plate_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PlateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A description for the plate.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_Description()
	 * @model dataType="org.openmicroscopy.ome.DescriptionType4"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Well</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.WellType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Well is a component of the Well/Plate/Screen construct to describe screening applications.
	 *         A Well has a number of WellSample elements that link to the Images collected in this well.
	 *         The ReagentRef links any Reagents that were used in this Well. A well is part of only one Plate.
	 *         The origin for the row and column identifiers is the top left corner of the plate starting at zero.
	 *         i.e The top left well of a plate is index (0,0)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Well</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_Well()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Well' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WellType> getWell();

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
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>Plate Acquisition</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.PlateAcquisitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         PlateAcquisition is used to describe a single acquisition run for a plate.
	 *         This object is used to record the set of images acquired in a single
	 *         acquisition run. The Images for this run are linked to PlateAcquisition
	 *         through WellSample.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plate Acquisition</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_PlateAcquisition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlateAcquisition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlateAcquisitionType> getPlateAcquisition();

	/**
	 * Returns the value of the '<em><b>Column Naming Convention</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.NamingConvention}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The ColumnNamingConvention
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column Naming Convention</em>' attribute.
	 * @see org.openmicroscopy.ome.NamingConvention
	 * @see #isSetColumnNamingConvention()
	 * @see #unsetColumnNamingConvention()
	 * @see #setColumnNamingConvention(NamingConvention)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_ColumnNamingConvention()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ColumnNamingConvention'"
	 * @generated
	 */
	NamingConvention getColumnNamingConvention();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getColumnNamingConvention <em>Column Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Naming Convention</em>' attribute.
	 * @see org.openmicroscopy.ome.NamingConvention
	 * @see #isSetColumnNamingConvention()
	 * @see #unsetColumnNamingConvention()
	 * @see #getColumnNamingConvention()
	 * @generated
	 */
	void setColumnNamingConvention(NamingConvention value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlateType#getColumnNamingConvention <em>Column Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColumnNamingConvention()
	 * @see #getColumnNamingConvention()
	 * @see #setColumnNamingConvention(NamingConvention)
	 * @generated
	 */
	void unsetColumnNamingConvention();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlateType#getColumnNamingConvention <em>Column Naming Convention</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Column Naming Convention</em>' attribute is set.
	 * @see #unsetColumnNamingConvention()
	 * @see #getColumnNamingConvention()
	 * @see #setColumnNamingConvention(NamingConvention)
	 * @generated
	 */
	boolean isSetColumnNamingConvention();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The number of columns in the plate
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #isSetColumns()
	 * @see #unsetColumns()
	 * @see #setColumns(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_Columns()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='Columns'"
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #isSetColumns()
	 * @see #unsetColumns()
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlateType#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColumns()
	 * @see #getColumns()
	 * @see #setColumns(int)
	 * @generated
	 */
	void unsetColumns();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlateType#getColumns <em>Columns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Columns</em>' attribute is set.
	 * @see #unsetColumns()
	 * @see #getColumns()
	 * @see #setColumns(int)
	 * @generated
	 */
	boolean isSetColumns();

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
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_ExternalIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExternalIdentifier'"
	 * @generated
	 */
	String getExternalIdentifier();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getExternalIdentifier <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Identifier</em>' attribute.
	 * @see #getExternalIdentifier()
	 * @generated
	 */
	void setExternalIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Field Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The index of the WellSample to display as the default Field
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Index</em>' attribute.
	 * @see #isSetFieldIndex()
	 * @see #unsetFieldIndex()
	 * @see #setFieldIndex(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_FieldIndex()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt"
	 *        extendedMetaData="kind='attribute' name='FieldIndex'"
	 * @generated
	 */
	int getFieldIndex();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getFieldIndex <em>Field Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Index</em>' attribute.
	 * @see #isSetFieldIndex()
	 * @see #unsetFieldIndex()
	 * @see #getFieldIndex()
	 * @generated
	 */
	void setFieldIndex(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlateType#getFieldIndex <em>Field Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFieldIndex()
	 * @see #getFieldIndex()
	 * @see #setFieldIndex(int)
	 * @generated
	 */
	void unsetFieldIndex();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlateType#getFieldIndex <em>Field Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Field Index</em>' attribute is set.
	 * @see #unsetFieldIndex()
	 * @see #getFieldIndex()
	 * @see #setFieldIndex(int)
	 * @generated
	 */
	boolean isSetFieldIndex();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_ID()
	 * @model dataType="org.openmicroscopy.ome.PlateID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The Name identifies the plate to the user.
	 *             It is used much like the ID, and so must be
	 *             unique within the document.
	 * 
	 *             If a plate name is not available when one is needed
	 *             it will be constructed in the following order:
	 *             1. If name is available use it.
	 *             2. If not use "Start time - End time"
	 *             (NOTE: Not a subtraction! A string representation
	 *             of the two times separated by a dash.)
	 *             3. If these times are not available use the Plate ID.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Row Naming Convention</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.NamingConvention}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The RowNamingConvention
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Row Naming Convention</em>' attribute.
	 * @see org.openmicroscopy.ome.NamingConvention
	 * @see #isSetRowNamingConvention()
	 * @see #unsetRowNamingConvention()
	 * @see #setRowNamingConvention(NamingConvention)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_RowNamingConvention()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='RowNamingConvention'"
	 * @generated
	 */
	NamingConvention getRowNamingConvention();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getRowNamingConvention <em>Row Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Naming Convention</em>' attribute.
	 * @see org.openmicroscopy.ome.NamingConvention
	 * @see #isSetRowNamingConvention()
	 * @see #unsetRowNamingConvention()
	 * @see #getRowNamingConvention()
	 * @generated
	 */
	void setRowNamingConvention(NamingConvention value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlateType#getRowNamingConvention <em>Row Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowNamingConvention()
	 * @see #getRowNamingConvention()
	 * @see #setRowNamingConvention(NamingConvention)
	 * @generated
	 */
	void unsetRowNamingConvention();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlateType#getRowNamingConvention <em>Row Naming Convention</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Row Naming Convention</em>' attribute is set.
	 * @see #unsetRowNamingConvention()
	 * @see #getRowNamingConvention()
	 * @see #setRowNamingConvention(NamingConvention)
	 * @generated
	 */
	boolean isSetRowNamingConvention();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The number of rows in the plate
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #isSetRows()
	 * @see #unsetRows()
	 * @see #setRows(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_Rows()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='Rows'"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #isSetRows()
	 * @see #unsetRows()
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlateType#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRows()
	 * @see #getRows()
	 * @see #setRows(int)
	 * @generated
	 */
	void unsetRows();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlateType#getRows <em>Rows</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rows</em>' attribute is set.
	 * @see #unsetRows()
	 * @see #getRows()
	 * @see #setRows(int)
	 * @generated
	 */
	boolean isSetRows();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A textual annotation of the current state of the plate with respect to the
	 *             experiment work-flow; e.g.
	 *             1. Seed cell: done; 2. Transfection: done;      3. Gel doc: todo.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_Status()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Well Origin X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This defines the X position to use for the origin of the
	 *             fields (individual images) taken in a well. It is used
	 *             with the X in the WellSample to display the fields
	 *             in the correct position relative to each other. Each Well
	 *             in the plate has the same well origin. Units are set by WellOriginXUnit.
	 * 
	 *             In the OMERO clients by convention we display the WellOrigin
	 *             in the center of the view.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Well Origin X</em>' attribute.
	 * @see #isSetWellOriginX()
	 * @see #unsetWellOriginX()
	 * @see #setWellOriginX(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_WellOriginX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='WellOriginX'"
	 * @generated
	 */
	float getWellOriginX();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginX <em>Well Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Well Origin X</em>' attribute.
	 * @see #isSetWellOriginX()
	 * @see #unsetWellOriginX()
	 * @see #getWellOriginX()
	 * @generated
	 */
	void setWellOriginX(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginX <em>Well Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWellOriginX()
	 * @see #getWellOriginX()
	 * @see #setWellOriginX(float)
	 * @generated
	 */
	void unsetWellOriginX();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginX <em>Well Origin X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Well Origin X</em>' attribute is set.
	 * @see #unsetWellOriginX()
	 * @see #getWellOriginX()
	 * @see #setWellOriginX(float)
	 * @generated
	 */
	boolean isSetWellOriginX();

	/**
	 * Returns the value of the '<em><b>Well Origin XUnit</b></em>' attribute.
	 * The default value is <code>"reference frame"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the well origin in X - default:reference frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Well Origin XUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetWellOriginXUnit()
	 * @see #unsetWellOriginXUnit()
	 * @see #setWellOriginXUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_WellOriginXUnit()
	 * @model default="reference frame" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='WellOriginXUnit'"
	 * @generated
	 */
	UnitsLength getWellOriginXUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginXUnit <em>Well Origin XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Well Origin XUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetWellOriginXUnit()
	 * @see #unsetWellOriginXUnit()
	 * @see #getWellOriginXUnit()
	 * @generated
	 */
	void setWellOriginXUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginXUnit <em>Well Origin XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWellOriginXUnit()
	 * @see #getWellOriginXUnit()
	 * @see #setWellOriginXUnit(UnitsLength)
	 * @generated
	 */
	void unsetWellOriginXUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginXUnit <em>Well Origin XUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Well Origin XUnit</em>' attribute is set.
	 * @see #unsetWellOriginXUnit()
	 * @see #getWellOriginXUnit()
	 * @see #setWellOriginXUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetWellOriginXUnit();

	/**
	 * Returns the value of the '<em><b>Well Origin Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This defines the Y position to use for the origin of the
	 *             fields (individual images) taken in a well. It is used
	 *             with the Y in the WellSample to display the fields
	 *             in the correct position relative to each other. Each Well
	 *             in the plate has the same well origin.  Units are set by WellOriginYUnit.
	 * 
	 *             In the OMERO clients by convention we display the WellOrigin
	 *             in the center of the view.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Well Origin Y</em>' attribute.
	 * @see #isSetWellOriginY()
	 * @see #unsetWellOriginY()
	 * @see #setWellOriginY(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_WellOriginY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='WellOriginY'"
	 * @generated
	 */
	float getWellOriginY();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginY <em>Well Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Well Origin Y</em>' attribute.
	 * @see #isSetWellOriginY()
	 * @see #unsetWellOriginY()
	 * @see #getWellOriginY()
	 * @generated
	 */
	void setWellOriginY(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginY <em>Well Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWellOriginY()
	 * @see #getWellOriginY()
	 * @see #setWellOriginY(float)
	 * @generated
	 */
	void unsetWellOriginY();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginY <em>Well Origin Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Well Origin Y</em>' attribute is set.
	 * @see #unsetWellOriginY()
	 * @see #getWellOriginY()
	 * @see #setWellOriginY(float)
	 * @generated
	 */
	boolean isSetWellOriginY();

	/**
	 * Returns the value of the '<em><b>Well Origin YUnit</b></em>' attribute.
	 * The default value is <code>"reference frame"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the well origin in Y - default:reference frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Well Origin YUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetWellOriginYUnit()
	 * @see #unsetWellOriginYUnit()
	 * @see #setWellOriginYUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateType_WellOriginYUnit()
	 * @model default="reference frame" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='WellOriginYUnit'"
	 * @generated
	 */
	UnitsLength getWellOriginYUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginYUnit <em>Well Origin YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Well Origin YUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetWellOriginYUnit()
	 * @see #unsetWellOriginYUnit()
	 * @see #getWellOriginYUnit()
	 * @generated
	 */
	void setWellOriginYUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginYUnit <em>Well Origin YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWellOriginYUnit()
	 * @see #getWellOriginYUnit()
	 * @see #setWellOriginYUnit(UnitsLength)
	 * @generated
	 */
	void unsetWellOriginYUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlateType#getWellOriginYUnit <em>Well Origin YUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Well Origin YUnit</em>' attribute is set.
	 * @see #unsetWellOriginYUnit()
	 * @see #getWellOriginYUnit()
	 * @see #setWellOriginYUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetWellOriginYUnit();

} // PlateType
