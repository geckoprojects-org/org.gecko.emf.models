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
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.ReagentRefType;
import org.openmicroscopy.ome.WellSampleType;
import org.openmicroscopy.ome.WellType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Well Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.WellTypeImpl#getWellSample <em>Well Sample</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellTypeImpl#getReagentRef <em>Reagent Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellTypeImpl#getExternalDescription <em>External Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellTypeImpl#getExternalIdentifier <em>External Identifier</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellTypeImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WellTypeImpl extends MinimalEObjectImpl.Container implements WellType {
	/**
	 * The cached value of the '{@link #getWellSample() <em>Well Sample</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellSample()
	 * @generated
	 * @ordered
	 */
	protected EList<WellSampleType> wellSample;

	/**
	 * The cached value of the '{@link #getReagentRef() <em>Reagent Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReagentRef()
	 * @generated
	 * @ordered
	 */
	protected ReagentRefType reagentRef;

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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final int COLOR_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected int color = COLOR_EDEFAULT;

	/**
	 * This is true if the Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorESet;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;

	/**
	 * This is true if the Column attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean columnESet;

	/**
	 * The default value of the '{@link #getExternalDescription() <em>External Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDescription() <em>External Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDescription()
	 * @generated
	 * @ordered
	 */
	protected String externalDescription = EXTERNAL_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * This is true if the Row attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WellTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getWellType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WellSampleType> getWellSample() {
		if (wellSample == null) {
			wellSample = new EObjectContainmentEList<WellSampleType>(WellSampleType.class, this, OMEPackage.WELL_TYPE__WELL_SAMPLE);
		}
		return wellSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReagentRefType getReagentRef() {
		return reagentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReagentRef(ReagentRefType newReagentRef, NotificationChain msgs) {
		ReagentRefType oldReagentRef = reagentRef;
		reagentRef = newReagentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_TYPE__REAGENT_REF, oldReagentRef, newReagentRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReagentRef(ReagentRefType newReagentRef) {
		if (newReagentRef != reagentRef) {
			NotificationChain msgs = null;
			if (reagentRef != null)
				msgs = ((InternalEObject)reagentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.WELL_TYPE__REAGENT_REF, null, msgs);
			if (newReagentRef != null)
				msgs = ((InternalEObject)newReagentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.WELL_TYPE__REAGENT_REF, null, msgs);
			msgs = basicSetReagentRef(newReagentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_TYPE__REAGENT_REF, newReagentRef, newReagentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.WELL_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(int newColor) {
		int oldColor = color;
		color = newColor;
		boolean oldColorESet = colorESet;
		colorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_TYPE__COLOR, oldColor, color, !oldColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetColor() {
		int oldColor = color;
		boolean oldColorESet = colorESet;
		color = COLOR_EDEFAULT;
		colorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.WELL_TYPE__COLOR, oldColor, COLOR_EDEFAULT, oldColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetColor() {
		return colorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		boolean oldColumnESet = columnESet;
		columnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_TYPE__COLUMN, oldColumn, column, !oldColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetColumn() {
		int oldColumn = column;
		boolean oldColumnESet = columnESet;
		column = COLUMN_EDEFAULT;
		columnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.WELL_TYPE__COLUMN, oldColumn, COLUMN_EDEFAULT, oldColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetColumn() {
		return columnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalDescription() {
		return externalDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalDescription(String newExternalDescription) {
		String oldExternalDescription = externalDescription;
		externalDescription = newExternalDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_TYPE__EXTERNAL_DESCRIPTION, oldExternalDescription, externalDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_TYPE__EXTERNAL_IDENTIFIER, oldExternalIdentifier, externalIdentifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRow(int newRow) {
		int oldRow = row;
		row = newRow;
		boolean oldRowESet = rowESet;
		rowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_TYPE__ROW, oldRow, row, !oldRowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRow() {
		int oldRow = row;
		boolean oldRowESet = rowESet;
		row = ROW_EDEFAULT;
		rowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.WELL_TYPE__ROW, oldRow, ROW_EDEFAULT, oldRowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRow() {
		return rowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.WELL_TYPE__WELL_SAMPLE:
				return ((InternalEList<?>)getWellSample()).basicRemove(otherEnd, msgs);
			case OMEPackage.WELL_TYPE__REAGENT_REF:
				return basicSetReagentRef(null, msgs);
			case OMEPackage.WELL_TYPE__ANNOTATION_REF:
				return ((InternalEList<?>)getAnnotationRef()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.WELL_TYPE__WELL_SAMPLE:
				return getWellSample();
			case OMEPackage.WELL_TYPE__REAGENT_REF:
				return getReagentRef();
			case OMEPackage.WELL_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.WELL_TYPE__COLOR:
				return getColor();
			case OMEPackage.WELL_TYPE__COLUMN:
				return getColumn();
			case OMEPackage.WELL_TYPE__EXTERNAL_DESCRIPTION:
				return getExternalDescription();
			case OMEPackage.WELL_TYPE__EXTERNAL_IDENTIFIER:
				return getExternalIdentifier();
			case OMEPackage.WELL_TYPE__ID:
				return getID();
			case OMEPackage.WELL_TYPE__ROW:
				return getRow();
			case OMEPackage.WELL_TYPE__TYPE:
				return getType();
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
			case OMEPackage.WELL_TYPE__WELL_SAMPLE:
				getWellSample().clear();
				getWellSample().addAll((Collection<? extends WellSampleType>)newValue);
				return;
			case OMEPackage.WELL_TYPE__REAGENT_REF:
				setReagentRef((ReagentRefType)newValue);
				return;
			case OMEPackage.WELL_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.WELL_TYPE__COLOR:
				setColor((Integer)newValue);
				return;
			case OMEPackage.WELL_TYPE__COLUMN:
				setColumn((Integer)newValue);
				return;
			case OMEPackage.WELL_TYPE__EXTERNAL_DESCRIPTION:
				setExternalDescription((String)newValue);
				return;
			case OMEPackage.WELL_TYPE__EXTERNAL_IDENTIFIER:
				setExternalIdentifier((String)newValue);
				return;
			case OMEPackage.WELL_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.WELL_TYPE__ROW:
				setRow((Integer)newValue);
				return;
			case OMEPackage.WELL_TYPE__TYPE:
				setType((String)newValue);
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
			case OMEPackage.WELL_TYPE__WELL_SAMPLE:
				getWellSample().clear();
				return;
			case OMEPackage.WELL_TYPE__REAGENT_REF:
				setReagentRef((ReagentRefType)null);
				return;
			case OMEPackage.WELL_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.WELL_TYPE__COLOR:
				unsetColor();
				return;
			case OMEPackage.WELL_TYPE__COLUMN:
				unsetColumn();
				return;
			case OMEPackage.WELL_TYPE__EXTERNAL_DESCRIPTION:
				setExternalDescription(EXTERNAL_DESCRIPTION_EDEFAULT);
				return;
			case OMEPackage.WELL_TYPE__EXTERNAL_IDENTIFIER:
				setExternalIdentifier(EXTERNAL_IDENTIFIER_EDEFAULT);
				return;
			case OMEPackage.WELL_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.WELL_TYPE__ROW:
				unsetRow();
				return;
			case OMEPackage.WELL_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case OMEPackage.WELL_TYPE__WELL_SAMPLE:
				return wellSample != null && !wellSample.isEmpty();
			case OMEPackage.WELL_TYPE__REAGENT_REF:
				return reagentRef != null;
			case OMEPackage.WELL_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.WELL_TYPE__COLOR:
				return isSetColor();
			case OMEPackage.WELL_TYPE__COLUMN:
				return isSetColumn();
			case OMEPackage.WELL_TYPE__EXTERNAL_DESCRIPTION:
				return EXTERNAL_DESCRIPTION_EDEFAULT == null ? externalDescription != null : !EXTERNAL_DESCRIPTION_EDEFAULT.equals(externalDescription);
			case OMEPackage.WELL_TYPE__EXTERNAL_IDENTIFIER:
				return EXTERNAL_IDENTIFIER_EDEFAULT == null ? externalIdentifier != null : !EXTERNAL_IDENTIFIER_EDEFAULT.equals(externalIdentifier);
			case OMEPackage.WELL_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.WELL_TYPE__ROW:
				return isSetRow();
			case OMEPackage.WELL_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (color: ");
		if (colorESet) result.append(color); else result.append("<unset>");
		result.append(", column: ");
		if (columnESet) result.append(column); else result.append("<unset>");
		result.append(", externalDescription: ");
		result.append(externalDescription);
		result.append(", externalIdentifier: ");
		result.append(externalIdentifier);
		result.append(", iD: ");
		result.append(iD);
		result.append(", row: ");
		if (rowESet) result.append(row); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //WellTypeImpl
