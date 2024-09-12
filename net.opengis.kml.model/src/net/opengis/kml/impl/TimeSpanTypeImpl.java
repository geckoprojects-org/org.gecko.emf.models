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
import net.opengis.kml.TimeSpanType;

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
 * An implementation of the model object '<em><b>Time Span Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.TimeSpanTypeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link net.opengis.kml.impl.TimeSpanTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.kml.impl.TimeSpanTypeImpl#getTimeSpanSimpleExtensionGroupGroup <em>Time Span Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.TimeSpanTypeImpl#getTimeSpanSimpleExtensionGroup <em>Time Span Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.TimeSpanTypeImpl#getTimeSpanObjectExtensionGroupGroup <em>Time Span Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.TimeSpanTypeImpl#getTimeSpanObjectExtensionGroup <em>Time Span Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSpanTypeImpl extends AbstractTimePrimitiveTypeImpl implements TimeSpanType {
	/**
	 * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar begin = BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSpanSimpleExtensionGroupGroup() <em>Time Span Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSpanSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap timeSpanSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getTimeSpanObjectExtensionGroupGroup() <em>Time Span Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSpanObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap timeSpanObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSpanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getTimeSpanType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegin(XMLGregorianCalendar newBegin) {
		XMLGregorianCalendar oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.TIME_SPAN_TYPE__BEGIN, oldBegin, begin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(XMLGregorianCalendar newEnd) {
		XMLGregorianCalendar oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.TIME_SPAN_TYPE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTimeSpanSimpleExtensionGroupGroup() {
		if (timeSpanSimpleExtensionGroupGroup == null) {
			timeSpanSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return timeSpanSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getTimeSpanSimpleExtensionGroup() {
		return getTimeSpanSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getTimeSpanType_TimeSpanSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTimeSpanObjectExtensionGroupGroup() {
		if (timeSpanObjectExtensionGroupGroup == null) {
			timeSpanObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return timeSpanObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getTimeSpanObjectExtensionGroup() {
		return getTimeSpanObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getTimeSpanType_TimeSpanObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getTimeSpanSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getTimeSpanObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getTimeSpanObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.TIME_SPAN_TYPE__BEGIN:
				return getBegin();
			case KMLPackage.TIME_SPAN_TYPE__END:
				return getEnd();
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getTimeSpanSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getTimeSpanSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_SIMPLE_EXTENSION_GROUP:
				return getTimeSpanSimpleExtensionGroup();
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getTimeSpanObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getTimeSpanObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP:
				return getTimeSpanObjectExtensionGroup();
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
			case KMLPackage.TIME_SPAN_TYPE__BEGIN:
				setBegin((XMLGregorianCalendar)newValue);
				return;
			case KMLPackage.TIME_SPAN_TYPE__END:
				setEnd((XMLGregorianCalendar)newValue);
				return;
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getTimeSpanSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getTimeSpanObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.TIME_SPAN_TYPE__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case KMLPackage.TIME_SPAN_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_SIMPLE_EXTENSION_GROUP_GROUP:
				getTimeSpanSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP_GROUP:
				getTimeSpanObjectExtensionGroupGroup().clear();
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
			case KMLPackage.TIME_SPAN_TYPE__BEGIN:
				return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
			case KMLPackage.TIME_SPAN_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_SIMPLE_EXTENSION_GROUP_GROUP:
				return timeSpanSimpleExtensionGroupGroup != null && !timeSpanSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_SIMPLE_EXTENSION_GROUP:
				return !getTimeSpanSimpleExtensionGroup().isEmpty();
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP_GROUP:
				return timeSpanObjectExtensionGroupGroup != null && !timeSpanObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP:
				return !getTimeSpanObjectExtensionGroup().isEmpty();
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
		result.append(" (begin: ");
		result.append(begin);
		result.append(", end: ");
		result.append(end);
		result.append(", timeSpanSimpleExtensionGroupGroup: ");
		result.append(timeSpanSimpleExtensionGroupGroup);
		result.append(", timeSpanObjectExtensionGroupGroup: ");
		result.append(timeSpanObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //TimeSpanTypeImpl
