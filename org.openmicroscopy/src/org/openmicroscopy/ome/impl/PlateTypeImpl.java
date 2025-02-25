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
package org.openmicroscopy.ome.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.NamingConvention;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.PlateAcquisitionType;
import org.openmicroscopy.ome.PlateType;
import org.openmicroscopy.ome.UnitsLength;
import org.openmicroscopy.ome.WellType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getWell <em>Well</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getPlateAcquisition <em>Plate Acquisition</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getColumnNamingConvention <em>Column Naming Convention</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getExternalIdentifier <em>External Identifier</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getFieldIndex <em>Field Index</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getRowNamingConvention <em>Row Naming Convention</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getWellOriginX <em>Well Origin X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getWellOriginXUnit <em>Well Origin XUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getWellOriginY <em>Well Origin Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateTypeImpl#getWellOriginYUnit <em>Well Origin YUnit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlateTypeImpl extends MinimalEObjectImpl.Container implements PlateType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWell() <em>Well</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWell()
	 * @generated
	 * @ordered
	 */
	protected EList<WellType> well;

	/**
	 * The cached value of the '{@link #getAnnotationRef() <em>Annotation Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationRefType> annotationRef;

	/**
	 * The cached value of the '{@link #getPlateAcquisition() <em>Plate Acquisition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlateAcquisition()
	 * @generated
	 * @ordered
	 */
	protected EList<PlateAcquisitionType> plateAcquisition;

	/**
	 * The default value of the '{@link #getColumnNamingConvention() <em>Column Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnNamingConvention()
	 * @generated
	 * @ordered
	 */
	protected static final NamingConvention COLUMN_NAMING_CONVENTION_EDEFAULT = NamingConvention.LETTER;

	/**
	 * The cached value of the '{@link #getColumnNamingConvention() <em>Column Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnNamingConvention()
	 * @generated
	 * @ordered
	 */
	protected NamingConvention columnNamingConvention = COLUMN_NAMING_CONVENTION_EDEFAULT;

	/**
	 * This is true if the Column Naming Convention attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean columnNamingConventionESet;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;

	/**
	 * This is true if the Columns attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean columnsESet;

	/**
	 * The default value of the '{@link #getExternalIdentifier() <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalIdentifier() <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String externalIdentifier = EXTERNAL_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldIndex() <em>Field Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int FIELD_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFieldIndex() <em>Field Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldIndex()
	 * @generated
	 * @ordered
	 */
	protected int fieldIndex = FIELD_INDEX_EDEFAULT;

	/**
	 * This is true if the Field Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fieldIndexESet;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowNamingConvention() <em>Row Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNamingConvention()
	 * @generated
	 * @ordered
	 */
	protected static final NamingConvention ROW_NAMING_CONVENTION_EDEFAULT = NamingConvention.LETTER;

	/**
	 * The cached value of the '{@link #getRowNamingConvention() <em>Row Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNamingConvention()
	 * @generated
	 * @ordered
	 */
	protected NamingConvention rowNamingConvention = ROW_NAMING_CONVENTION_EDEFAULT;

	/**
	 * This is true if the Row Naming Convention attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowNamingConventionESet;

	/**
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected int rows = ROWS_EDEFAULT;

	/**
	 * This is true if the Rows attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowsESet;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWellOriginX() <em>Well Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellOriginX()
	 * @generated
	 * @ordered
	 */
	protected static final float WELL_ORIGIN_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWellOriginX() <em>Well Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellOriginX()
	 * @generated
	 * @ordered
	 */
	protected float wellOriginX = WELL_ORIGIN_X_EDEFAULT;

	/**
	 * This is true if the Well Origin X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wellOriginXESet;

	/**
	 * The default value of the '{@link #getWellOriginXUnit() <em>Well Origin XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellOriginXUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength WELL_ORIGIN_XUNIT_EDEFAULT = UnitsLength.REFERENCE_FRAME;

	/**
	 * The cached value of the '{@link #getWellOriginXUnit() <em>Well Origin XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellOriginXUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength wellOriginXUnit = WELL_ORIGIN_XUNIT_EDEFAULT;

	/**
	 * This is true if the Well Origin XUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wellOriginXUnitESet;

	/**
	 * The default value of the '{@link #getWellOriginY() <em>Well Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellOriginY()
	 * @generated
	 * @ordered
	 */
	protected static final float WELL_ORIGIN_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWellOriginY() <em>Well Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellOriginY()
	 * @generated
	 * @ordered
	 */
	protected float wellOriginY = WELL_ORIGIN_Y_EDEFAULT;

	/**
	 * This is true if the Well Origin Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wellOriginYESet;

	/**
	 * The default value of the '{@link #getWellOriginYUnit() <em>Well Origin YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellOriginYUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength WELL_ORIGIN_YUNIT_EDEFAULT = UnitsLength.REFERENCE_FRAME;

	/**
	 * The cached value of the '{@link #getWellOriginYUnit() <em>Well Origin YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellOriginYUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength wellOriginYUnit = WELL_ORIGIN_YUNIT_EDEFAULT;

	/**
	 * This is true if the Well Origin YUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wellOriginYUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getPlateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WellType> getWell() {
		if (well == null) {
			well = new EObjectContainmentEList<WellType>(WellType.class, this, OMEPackage.PLATE_TYPE__WELL);
		}
		return well;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.PLATE_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlateAcquisitionType> getPlateAcquisition() {
		if (plateAcquisition == null) {
			plateAcquisition = new EObjectContainmentEList<PlateAcquisitionType>(PlateAcquisitionType.class, this, OMEPackage.PLATE_TYPE__PLATE_ACQUISITION);
		}
		return plateAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingConvention getColumnNamingConvention() {
		return columnNamingConvention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnNamingConvention(NamingConvention newColumnNamingConvention) {
		NamingConvention oldColumnNamingConvention = columnNamingConvention;
		columnNamingConvention = newColumnNamingConvention == null ? COLUMN_NAMING_CONVENTION_EDEFAULT : newColumnNamingConvention;
		boolean oldColumnNamingConventionESet = columnNamingConventionESet;
		columnNamingConventionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__COLUMN_NAMING_CONVENTION, oldColumnNamingConvention, columnNamingConvention, !oldColumnNamingConventionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetColumnNamingConvention() {
		NamingConvention oldColumnNamingConvention = columnNamingConvention;
		boolean oldColumnNamingConventionESet = columnNamingConventionESet;
		columnNamingConvention = COLUMN_NAMING_CONVENTION_EDEFAULT;
		columnNamingConventionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLATE_TYPE__COLUMN_NAMING_CONVENTION, oldColumnNamingConvention, COLUMN_NAMING_CONVENTION_EDEFAULT, oldColumnNamingConventionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetColumnNamingConvention() {
		return columnNamingConventionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		boolean oldColumnsESet = columnsESet;
		columnsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__COLUMNS, oldColumns, columns, !oldColumnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetColumns() {
		int oldColumns = columns;
		boolean oldColumnsESet = columnsESet;
		columns = COLUMNS_EDEFAULT;
		columnsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLATE_TYPE__COLUMNS, oldColumns, COLUMNS_EDEFAULT, oldColumnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetColumns() {
		return columnsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalIdentifier() {
		return externalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalIdentifier(String newExternalIdentifier) {
		String oldExternalIdentifier = externalIdentifier;
		externalIdentifier = newExternalIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__EXTERNAL_IDENTIFIER, oldExternalIdentifier, externalIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFieldIndex() {
		return fieldIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldIndex(int newFieldIndex) {
		int oldFieldIndex = fieldIndex;
		fieldIndex = newFieldIndex;
		boolean oldFieldIndexESet = fieldIndexESet;
		fieldIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__FIELD_INDEX, oldFieldIndex, fieldIndex, !oldFieldIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFieldIndex() {
		int oldFieldIndex = fieldIndex;
		boolean oldFieldIndexESet = fieldIndexESet;
		fieldIndex = FIELD_INDEX_EDEFAULT;
		fieldIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLATE_TYPE__FIELD_INDEX, oldFieldIndex, FIELD_INDEX_EDEFAULT, oldFieldIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFieldIndex() {
		return fieldIndexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingConvention getRowNamingConvention() {
		return rowNamingConvention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowNamingConvention(NamingConvention newRowNamingConvention) {
		NamingConvention oldRowNamingConvention = rowNamingConvention;
		rowNamingConvention = newRowNamingConvention == null ? ROW_NAMING_CONVENTION_EDEFAULT : newRowNamingConvention;
		boolean oldRowNamingConventionESet = rowNamingConventionESet;
		rowNamingConventionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__ROW_NAMING_CONVENTION, oldRowNamingConvention, rowNamingConvention, !oldRowNamingConventionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRowNamingConvention() {
		NamingConvention oldRowNamingConvention = rowNamingConvention;
		boolean oldRowNamingConventionESet = rowNamingConventionESet;
		rowNamingConvention = ROW_NAMING_CONVENTION_EDEFAULT;
		rowNamingConventionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLATE_TYPE__ROW_NAMING_CONVENTION, oldRowNamingConvention, ROW_NAMING_CONVENTION_EDEFAULT, oldRowNamingConventionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRowNamingConvention() {
		return rowNamingConventionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRows(int newRows) {
		int oldRows = rows;
		rows = newRows;
		boolean oldRowsESet = rowsESet;
		rowsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__ROWS, oldRows, rows, !oldRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRows() {
		int oldRows = rows;
		boolean oldRowsESet = rowsESet;
		rows = ROWS_EDEFAULT;
		rowsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLATE_TYPE__ROWS, oldRows, ROWS_EDEFAULT, oldRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRows() {
		return rowsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWellOriginX() {
		return wellOriginX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWellOriginX(float newWellOriginX) {
		float oldWellOriginX = wellOriginX;
		wellOriginX = newWellOriginX;
		boolean oldWellOriginXESet = wellOriginXESet;
		wellOriginXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__WELL_ORIGIN_X, oldWellOriginX, wellOriginX, !oldWellOriginXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWellOriginX() {
		float oldWellOriginX = wellOriginX;
		boolean oldWellOriginXESet = wellOriginXESet;
		wellOriginX = WELL_ORIGIN_X_EDEFAULT;
		wellOriginXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLATE_TYPE__WELL_ORIGIN_X, oldWellOriginX, WELL_ORIGIN_X_EDEFAULT, oldWellOriginXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWellOriginX() {
		return wellOriginXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getWellOriginXUnit() {
		return wellOriginXUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWellOriginXUnit(UnitsLength newWellOriginXUnit) {
		UnitsLength oldWellOriginXUnit = wellOriginXUnit;
		wellOriginXUnit = newWellOriginXUnit == null ? WELL_ORIGIN_XUNIT_EDEFAULT : newWellOriginXUnit;
		boolean oldWellOriginXUnitESet = wellOriginXUnitESet;
		wellOriginXUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__WELL_ORIGIN_XUNIT, oldWellOriginXUnit, wellOriginXUnit, !oldWellOriginXUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWellOriginXUnit() {
		UnitsLength oldWellOriginXUnit = wellOriginXUnit;
		boolean oldWellOriginXUnitESet = wellOriginXUnitESet;
		wellOriginXUnit = WELL_ORIGIN_XUNIT_EDEFAULT;
		wellOriginXUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLATE_TYPE__WELL_ORIGIN_XUNIT, oldWellOriginXUnit, WELL_ORIGIN_XUNIT_EDEFAULT, oldWellOriginXUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWellOriginXUnit() {
		return wellOriginXUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWellOriginY() {
		return wellOriginY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWellOriginY(float newWellOriginY) {
		float oldWellOriginY = wellOriginY;
		wellOriginY = newWellOriginY;
		boolean oldWellOriginYESet = wellOriginYESet;
		wellOriginYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__WELL_ORIGIN_Y, oldWellOriginY, wellOriginY, !oldWellOriginYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWellOriginY() {
		float oldWellOriginY = wellOriginY;
		boolean oldWellOriginYESet = wellOriginYESet;
		wellOriginY = WELL_ORIGIN_Y_EDEFAULT;
		wellOriginYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLATE_TYPE__WELL_ORIGIN_Y, oldWellOriginY, WELL_ORIGIN_Y_EDEFAULT, oldWellOriginYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWellOriginY() {
		return wellOriginYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getWellOriginYUnit() {
		return wellOriginYUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWellOriginYUnit(UnitsLength newWellOriginYUnit) {
		UnitsLength oldWellOriginYUnit = wellOriginYUnit;
		wellOriginYUnit = newWellOriginYUnit == null ? WELL_ORIGIN_YUNIT_EDEFAULT : newWellOriginYUnit;
		boolean oldWellOriginYUnitESet = wellOriginYUnitESet;
		wellOriginYUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_TYPE__WELL_ORIGIN_YUNIT, oldWellOriginYUnit, wellOriginYUnit, !oldWellOriginYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWellOriginYUnit() {
		UnitsLength oldWellOriginYUnit = wellOriginYUnit;
		boolean oldWellOriginYUnitESet = wellOriginYUnitESet;
		wellOriginYUnit = WELL_ORIGIN_YUNIT_EDEFAULT;
		wellOriginYUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLATE_TYPE__WELL_ORIGIN_YUNIT, oldWellOriginYUnit, WELL_ORIGIN_YUNIT_EDEFAULT, oldWellOriginYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWellOriginYUnit() {
		return wellOriginYUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.PLATE_TYPE__WELL:
				return ((InternalEList<?>)getWell()).basicRemove(otherEnd, msgs);
			case OMEPackage.PLATE_TYPE__ANNOTATION_REF:
				return ((InternalEList<?>)getAnnotationRef()).basicRemove(otherEnd, msgs);
			case OMEPackage.PLATE_TYPE__PLATE_ACQUISITION:
				return ((InternalEList<?>)getPlateAcquisition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.PLATE_TYPE__DESCRIPTION:
				return getDescription();
			case OMEPackage.PLATE_TYPE__WELL:
				return getWell();
			case OMEPackage.PLATE_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.PLATE_TYPE__PLATE_ACQUISITION:
				return getPlateAcquisition();
			case OMEPackage.PLATE_TYPE__COLUMN_NAMING_CONVENTION:
				return getColumnNamingConvention();
			case OMEPackage.PLATE_TYPE__COLUMNS:
				return getColumns();
			case OMEPackage.PLATE_TYPE__EXTERNAL_IDENTIFIER:
				return getExternalIdentifier();
			case OMEPackage.PLATE_TYPE__FIELD_INDEX:
				return getFieldIndex();
			case OMEPackage.PLATE_TYPE__ID:
				return getID();
			case OMEPackage.PLATE_TYPE__NAME:
				return getName();
			case OMEPackage.PLATE_TYPE__ROW_NAMING_CONVENTION:
				return getRowNamingConvention();
			case OMEPackage.PLATE_TYPE__ROWS:
				return getRows();
			case OMEPackage.PLATE_TYPE__STATUS:
				return getStatus();
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_X:
				return getWellOriginX();
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_XUNIT:
				return getWellOriginXUnit();
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_Y:
				return getWellOriginY();
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_YUNIT:
				return getWellOriginYUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMEPackage.PLATE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OMEPackage.PLATE_TYPE__WELL:
				getWell().clear();
				getWell().addAll((Collection<? extends WellType>)newValue);
				return;
			case OMEPackage.PLATE_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.PLATE_TYPE__PLATE_ACQUISITION:
				getPlateAcquisition().clear();
				getPlateAcquisition().addAll((Collection<? extends PlateAcquisitionType>)newValue);
				return;
			case OMEPackage.PLATE_TYPE__COLUMN_NAMING_CONVENTION:
				setColumnNamingConvention((NamingConvention)newValue);
				return;
			case OMEPackage.PLATE_TYPE__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case OMEPackage.PLATE_TYPE__EXTERNAL_IDENTIFIER:
				setExternalIdentifier((String)newValue);
				return;
			case OMEPackage.PLATE_TYPE__FIELD_INDEX:
				setFieldIndex((Integer)newValue);
				return;
			case OMEPackage.PLATE_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.PLATE_TYPE__NAME:
				setName((String)newValue);
				return;
			case OMEPackage.PLATE_TYPE__ROW_NAMING_CONVENTION:
				setRowNamingConvention((NamingConvention)newValue);
				return;
			case OMEPackage.PLATE_TYPE__ROWS:
				setRows((Integer)newValue);
				return;
			case OMEPackage.PLATE_TYPE__STATUS:
				setStatus((String)newValue);
				return;
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_X:
				setWellOriginX((Float)newValue);
				return;
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_XUNIT:
				setWellOriginXUnit((UnitsLength)newValue);
				return;
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_Y:
				setWellOriginY((Float)newValue);
				return;
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_YUNIT:
				setWellOriginYUnit((UnitsLength)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OMEPackage.PLATE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OMEPackage.PLATE_TYPE__WELL:
				getWell().clear();
				return;
			case OMEPackage.PLATE_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.PLATE_TYPE__PLATE_ACQUISITION:
				getPlateAcquisition().clear();
				return;
			case OMEPackage.PLATE_TYPE__COLUMN_NAMING_CONVENTION:
				unsetColumnNamingConvention();
				return;
			case OMEPackage.PLATE_TYPE__COLUMNS:
				unsetColumns();
				return;
			case OMEPackage.PLATE_TYPE__EXTERNAL_IDENTIFIER:
				setExternalIdentifier(EXTERNAL_IDENTIFIER_EDEFAULT);
				return;
			case OMEPackage.PLATE_TYPE__FIELD_INDEX:
				unsetFieldIndex();
				return;
			case OMEPackage.PLATE_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.PLATE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OMEPackage.PLATE_TYPE__ROW_NAMING_CONVENTION:
				unsetRowNamingConvention();
				return;
			case OMEPackage.PLATE_TYPE__ROWS:
				unsetRows();
				return;
			case OMEPackage.PLATE_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_X:
				unsetWellOriginX();
				return;
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_XUNIT:
				unsetWellOriginXUnit();
				return;
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_Y:
				unsetWellOriginY();
				return;
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_YUNIT:
				unsetWellOriginYUnit();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OMEPackage.PLATE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OMEPackage.PLATE_TYPE__WELL:
				return well != null && !well.isEmpty();
			case OMEPackage.PLATE_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.PLATE_TYPE__PLATE_ACQUISITION:
				return plateAcquisition != null && !plateAcquisition.isEmpty();
			case OMEPackage.PLATE_TYPE__COLUMN_NAMING_CONVENTION:
				return isSetColumnNamingConvention();
			case OMEPackage.PLATE_TYPE__COLUMNS:
				return isSetColumns();
			case OMEPackage.PLATE_TYPE__EXTERNAL_IDENTIFIER:
				return EXTERNAL_IDENTIFIER_EDEFAULT == null ? externalIdentifier != null : !EXTERNAL_IDENTIFIER_EDEFAULT.equals(externalIdentifier);
			case OMEPackage.PLATE_TYPE__FIELD_INDEX:
				return isSetFieldIndex();
			case OMEPackage.PLATE_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.PLATE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OMEPackage.PLATE_TYPE__ROW_NAMING_CONVENTION:
				return isSetRowNamingConvention();
			case OMEPackage.PLATE_TYPE__ROWS:
				return isSetRows();
			case OMEPackage.PLATE_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_X:
				return isSetWellOriginX();
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_XUNIT:
				return isSetWellOriginXUnit();
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_Y:
				return isSetWellOriginY();
			case OMEPackage.PLATE_TYPE__WELL_ORIGIN_YUNIT:
				return isSetWellOriginYUnit();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", columnNamingConvention: ");
		if (columnNamingConventionESet) result.append(columnNamingConvention); else result.append("<unset>");
		result.append(", columns: ");
		if (columnsESet) result.append(columns); else result.append("<unset>");
		result.append(", externalIdentifier: ");
		result.append(externalIdentifier);
		result.append(", fieldIndex: ");
		if (fieldIndexESet) result.append(fieldIndex); else result.append("<unset>");
		result.append(", iD: ");
		result.append(iD);
		result.append(", name: ");
		result.append(name);
		result.append(", rowNamingConvention: ");
		if (rowNamingConventionESet) result.append(rowNamingConvention); else result.append("<unset>");
		result.append(", rows: ");
		if (rowsESet) result.append(rows); else result.append("<unset>");
		result.append(", status: ");
		result.append(status);
		result.append(", wellOriginX: ");
		if (wellOriginXESet) result.append(wellOriginX); else result.append("<unset>");
		result.append(", wellOriginXUnit: ");
		if (wellOriginXUnitESet) result.append(wellOriginXUnit); else result.append("<unset>");
		result.append(", wellOriginY: ");
		if (wellOriginYESet) result.append(wellOriginY); else result.append("<unset>");
		result.append(", wellOriginYUnit: ");
		if (wellOriginYUnitESet) result.append(wellOriginYUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PlateTypeImpl
