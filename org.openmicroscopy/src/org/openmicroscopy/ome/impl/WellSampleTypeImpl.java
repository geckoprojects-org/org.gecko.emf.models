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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openmicroscopy.ome.ImageRefType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.UnitsLength;
import org.openmicroscopy.ome.WellSampleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Well Sample Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.WellSampleTypeImpl#getImageRef <em>Image Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellSampleTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellSampleTypeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellSampleTypeImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellSampleTypeImpl#getPositionXUnit <em>Position XUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellSampleTypeImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellSampleTypeImpl#getPositionYUnit <em>Position YUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.WellSampleTypeImpl#getTimepoint <em>Timepoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WellSampleTypeImpl extends MinimalEObjectImpl.Container implements WellSampleType {
	/**
	 * The cached value of the '{@link #getImageRef() <em>Image Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageRef()
	 * @generated
	 * @ordered
	 */
	protected ImageRefType imageRef;

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
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * This is true if the Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indexESet;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected float positionX = POSITION_X_EDEFAULT;

	/**
	 * This is true if the Position X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionXESet;

	/**
	 * The default value of the '{@link #getPositionXUnit() <em>Position XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength POSITION_XUNIT_EDEFAULT = UnitsLength.REFERENCE_FRAME;

	/**
	 * The cached value of the '{@link #getPositionXUnit() <em>Position XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength positionXUnit = POSITION_XUNIT_EDEFAULT;

	/**
	 * This is true if the Position XUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionXUnitESet;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected float positionY = POSITION_Y_EDEFAULT;

	/**
	 * This is true if the Position Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionYESet;

	/**
	 * The default value of the '{@link #getPositionYUnit() <em>Position YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionYUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength POSITION_YUNIT_EDEFAULT = UnitsLength.REFERENCE_FRAME;

	/**
	 * The cached value of the '{@link #getPositionYUnit() <em>Position YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionYUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength positionYUnit = POSITION_YUNIT_EDEFAULT;

	/**
	 * This is true if the Position YUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionYUnitESet;

	/**
	 * The default value of the '{@link #getTimepoint() <em>Timepoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimepoint()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMEPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimepoint() <em>Timepoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimepoint()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timepoint = TIMEPOINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WellSampleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getWellSampleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageRefType getImageRef() {
		return imageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageRef(ImageRefType newImageRef, NotificationChain msgs) {
		ImageRefType oldImageRef = imageRef;
		imageRef = newImageRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_SAMPLE_TYPE__IMAGE_REF, oldImageRef, newImageRef);
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
	public void setImageRef(ImageRefType newImageRef) {
		if (newImageRef != imageRef) {
			NotificationChain msgs = null;
			if (imageRef != null)
				msgs = ((InternalEObject)imageRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.WELL_SAMPLE_TYPE__IMAGE_REF, null, msgs);
			if (newImageRef != null)
				msgs = ((InternalEObject)newImageRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.WELL_SAMPLE_TYPE__IMAGE_REF, null, msgs);
			msgs = basicSetImageRef(newImageRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_SAMPLE_TYPE__IMAGE_REF, newImageRef, newImageRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_SAMPLE_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		boolean oldIndexESet = indexESet;
		indexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_SAMPLE_TYPE__INDEX, oldIndex, index, !oldIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIndex() {
		int oldIndex = index;
		boolean oldIndexESet = indexESet;
		index = INDEX_EDEFAULT;
		indexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.WELL_SAMPLE_TYPE__INDEX, oldIndex, INDEX_EDEFAULT, oldIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIndex() {
		return indexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionX(float newPositionX) {
		float oldPositionX = positionX;
		positionX = newPositionX;
		boolean oldPositionXESet = positionXESet;
		positionXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_SAMPLE_TYPE__POSITION_X, oldPositionX, positionX, !oldPositionXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPositionX() {
		float oldPositionX = positionX;
		boolean oldPositionXESet = positionXESet;
		positionX = POSITION_X_EDEFAULT;
		positionXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.WELL_SAMPLE_TYPE__POSITION_X, oldPositionX, POSITION_X_EDEFAULT, oldPositionXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPositionX() {
		return positionXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getPositionXUnit() {
		return positionXUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionXUnit(UnitsLength newPositionXUnit) {
		UnitsLength oldPositionXUnit = positionXUnit;
		positionXUnit = newPositionXUnit == null ? POSITION_XUNIT_EDEFAULT : newPositionXUnit;
		boolean oldPositionXUnitESet = positionXUnitESet;
		positionXUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_SAMPLE_TYPE__POSITION_XUNIT, oldPositionXUnit, positionXUnit, !oldPositionXUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPositionXUnit() {
		UnitsLength oldPositionXUnit = positionXUnit;
		boolean oldPositionXUnitESet = positionXUnitESet;
		positionXUnit = POSITION_XUNIT_EDEFAULT;
		positionXUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.WELL_SAMPLE_TYPE__POSITION_XUNIT, oldPositionXUnit, POSITION_XUNIT_EDEFAULT, oldPositionXUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPositionXUnit() {
		return positionXUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionY(float newPositionY) {
		float oldPositionY = positionY;
		positionY = newPositionY;
		boolean oldPositionYESet = positionYESet;
		positionYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_SAMPLE_TYPE__POSITION_Y, oldPositionY, positionY, !oldPositionYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPositionY() {
		float oldPositionY = positionY;
		boolean oldPositionYESet = positionYESet;
		positionY = POSITION_Y_EDEFAULT;
		positionYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.WELL_SAMPLE_TYPE__POSITION_Y, oldPositionY, POSITION_Y_EDEFAULT, oldPositionYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPositionY() {
		return positionYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getPositionYUnit() {
		return positionYUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionYUnit(UnitsLength newPositionYUnit) {
		UnitsLength oldPositionYUnit = positionYUnit;
		positionYUnit = newPositionYUnit == null ? POSITION_YUNIT_EDEFAULT : newPositionYUnit;
		boolean oldPositionYUnitESet = positionYUnitESet;
		positionYUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_SAMPLE_TYPE__POSITION_YUNIT, oldPositionYUnit, positionYUnit, !oldPositionYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPositionYUnit() {
		UnitsLength oldPositionYUnit = positionYUnit;
		boolean oldPositionYUnitESet = positionYUnitESet;
		positionYUnit = POSITION_YUNIT_EDEFAULT;
		positionYUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.WELL_SAMPLE_TYPE__POSITION_YUNIT, oldPositionYUnit, POSITION_YUNIT_EDEFAULT, oldPositionYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPositionYUnit() {
		return positionYUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimepoint() {
		return timepoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimepoint(XMLGregorianCalendar newTimepoint) {
		XMLGregorianCalendar oldTimepoint = timepoint;
		timepoint = newTimepoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.WELL_SAMPLE_TYPE__TIMEPOINT, oldTimepoint, timepoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.WELL_SAMPLE_TYPE__IMAGE_REF:
				return basicSetImageRef(null, msgs);
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
			case OMEPackage.WELL_SAMPLE_TYPE__IMAGE_REF:
				return getImageRef();
			case OMEPackage.WELL_SAMPLE_TYPE__ID:
				return getID();
			case OMEPackage.WELL_SAMPLE_TYPE__INDEX:
				return getIndex();
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_X:
				return getPositionX();
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_XUNIT:
				return getPositionXUnit();
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_Y:
				return getPositionY();
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_YUNIT:
				return getPositionYUnit();
			case OMEPackage.WELL_SAMPLE_TYPE__TIMEPOINT:
				return getTimepoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMEPackage.WELL_SAMPLE_TYPE__IMAGE_REF:
				setImageRef((ImageRefType)newValue);
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__INDEX:
				setIndex((Integer)newValue);
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_X:
				setPositionX((Float)newValue);
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_XUNIT:
				setPositionXUnit((UnitsLength)newValue);
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_Y:
				setPositionY((Float)newValue);
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_YUNIT:
				setPositionYUnit((UnitsLength)newValue);
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__TIMEPOINT:
				setTimepoint((XMLGregorianCalendar)newValue);
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
			case OMEPackage.WELL_SAMPLE_TYPE__IMAGE_REF:
				setImageRef((ImageRefType)null);
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__INDEX:
				unsetIndex();
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_X:
				unsetPositionX();
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_XUNIT:
				unsetPositionXUnit();
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_Y:
				unsetPositionY();
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_YUNIT:
				unsetPositionYUnit();
				return;
			case OMEPackage.WELL_SAMPLE_TYPE__TIMEPOINT:
				setTimepoint(TIMEPOINT_EDEFAULT);
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
			case OMEPackage.WELL_SAMPLE_TYPE__IMAGE_REF:
				return imageRef != null;
			case OMEPackage.WELL_SAMPLE_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.WELL_SAMPLE_TYPE__INDEX:
				return isSetIndex();
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_X:
				return isSetPositionX();
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_XUNIT:
				return isSetPositionXUnit();
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_Y:
				return isSetPositionY();
			case OMEPackage.WELL_SAMPLE_TYPE__POSITION_YUNIT:
				return isSetPositionYUnit();
			case OMEPackage.WELL_SAMPLE_TYPE__TIMEPOINT:
				return TIMEPOINT_EDEFAULT == null ? timepoint != null : !TIMEPOINT_EDEFAULT.equals(timepoint);
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(", index: ");
		if (indexESet) result.append(index); else result.append("<unset>");
		result.append(", positionX: ");
		if (positionXESet) result.append(positionX); else result.append("<unset>");
		result.append(", positionXUnit: ");
		if (positionXUnitESet) result.append(positionXUnit); else result.append("<unset>");
		result.append(", positionY: ");
		if (positionYESet) result.append(positionY); else result.append("<unset>");
		result.append(", positionYUnit: ");
		if (positionYUnitESet) result.append(positionYUnit); else result.append("<unset>");
		result.append(", timepoint: ");
		result.append(timepoint);
		result.append(')');
		return result.toString();
	}

} //WellSampleTypeImpl
