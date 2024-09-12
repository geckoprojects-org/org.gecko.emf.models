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
package net.opengis.kml.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.TimeStampType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Stamp Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.TimeStampTypeImpl#getWhen <em>When</em>}</li>
 *   <li>{@link net.opengis.kml.impl.TimeStampTypeImpl#getTimeStampSimpleExtensionGroupGroup <em>Time Stamp Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.TimeStampTypeImpl#getTimeStampSimpleExtensionGroup <em>Time Stamp Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.TimeStampTypeImpl#getTimeStampObjectExtensionGroupGroup <em>Time Stamp Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.TimeStampTypeImpl#getTimeStampObjectExtensionGroup <em>Time Stamp Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeStampTypeImpl extends AbstractTimePrimitiveTypeImpl implements TimeStampType {
	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar when = WHEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeStampSimpleExtensionGroupGroup() <em>Time Stamp Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStampSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap timeStampSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getTimeStampObjectExtensionGroupGroup() <em>Time Stamp Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStampObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap timeStampObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeStampTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getTimeStampType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen(XMLGregorianCalendar newWhen) {
		XMLGregorianCalendar oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.TIME_STAMP_TYPE__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTimeStampSimpleExtensionGroupGroup() {
		if (timeStampSimpleExtensionGroupGroup == null) {
			timeStampSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return timeStampSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getTimeStampSimpleExtensionGroup() {
		return getTimeStampSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getTimeStampType_TimeStampSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTimeStampObjectExtensionGroupGroup() {
		if (timeStampObjectExtensionGroupGroup == null) {
			timeStampObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return timeStampObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getTimeStampObjectExtensionGroup() {
		return getTimeStampObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getTimeStampType_TimeStampObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getTimeStampSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getTimeStampObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getTimeStampObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.TIME_STAMP_TYPE__WHEN:
				return getWhen();
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getTimeStampSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getTimeStampSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_SIMPLE_EXTENSION_GROUP:
				return getTimeStampSimpleExtensionGroup();
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getTimeStampObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getTimeStampObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP:
				return getTimeStampObjectExtensionGroup();
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
			case KMLPackage.TIME_STAMP_TYPE__WHEN:
				setWhen((XMLGregorianCalendar)newValue);
				return;
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getTimeStampSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getTimeStampObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.TIME_STAMP_TYPE__WHEN:
				setWhen(WHEN_EDEFAULT);
				return;
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_SIMPLE_EXTENSION_GROUP_GROUP:
				getTimeStampSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP_GROUP:
				getTimeStampObjectExtensionGroupGroup().clear();
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
			case KMLPackage.TIME_STAMP_TYPE__WHEN:
				return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_SIMPLE_EXTENSION_GROUP_GROUP:
				return timeStampSimpleExtensionGroupGroup != null && !timeStampSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_SIMPLE_EXTENSION_GROUP:
				return !getTimeStampSimpleExtensionGroup().isEmpty();
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP_GROUP:
				return timeStampObjectExtensionGroupGroup != null && !timeStampObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP:
				return !getTimeStampObjectExtensionGroup().isEmpty();
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
		result.append(" (when: ");
		result.append(when);
		result.append(", timeStampSimpleExtensionGroupGroup: ");
		result.append(timeStampSimpleExtensionGroupGroup);
		result.append(", timeStampObjectExtensionGroupGroup: ");
		result.append(timeStampObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //TimeStampTypeImpl
