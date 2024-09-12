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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDCoverageDescriptionPropertyType;
import org.isotc211._2005.gmd.MDCoverageDescriptionType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Coverage Description Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getMDCoverageDescriptionGroup <em>MD Coverage Description Group</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getMDCoverageDescription <em>MD Coverage Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionPropertyTypeImpl#getUuidref <em>Uuidref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDCoverageDescriptionPropertyTypeImpl extends MinimalEObjectImpl.Container implements MDCoverageDescriptionPropertyType {
	/**
	 * The cached value of the '{@link #getMDCoverageDescriptionGroup() <em>MD Coverage Description Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDCoverageDescriptionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mDCoverageDescriptionGroup;

	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected String arcrole = ARCROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object NIL_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected Object nilReason = NIL_REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getUuidref() <em>Uuidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuidref()
	 * @generated
	 * @ordered
	 */
	protected static final String UUIDREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuidref() <em>Uuidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuidref()
	 * @generated
	 * @ordered
	 */
	protected String uuidref = UUIDREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDCoverageDescriptionPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDCoverageDescriptionPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMDCoverageDescriptionGroup() {
		if (mDCoverageDescriptionGroup == null) {
			mDCoverageDescriptionGroup = new BasicFeatureMap(this, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION_GROUP);
		}
		return mDCoverageDescriptionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCoverageDescriptionType getMDCoverageDescription() {
		return (MDCoverageDescriptionType)getMDCoverageDescriptionGroup().get(GMDPackage.eINSTANCE.getMDCoverageDescriptionPropertyType_MDCoverageDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDCoverageDescription(MDCoverageDescriptionType newMDCoverageDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMDCoverageDescriptionGroup()).basicAdd(GMDPackage.eINSTANCE.getMDCoverageDescriptionPropertyType_MDCoverageDescription(), newMDCoverageDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDCoverageDescription(MDCoverageDescriptionType newMDCoverageDescription) {
		((FeatureMap.Internal)getMDCoverageDescriptionGroup()).set(GMDPackage.eINSTANCE.getMDCoverageDescriptionPropertyType_MDCoverageDescription(), newMDCoverageDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArcrole() {
		return arcrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcrole(String newArcrole) {
		String oldArcrole = arcrole;
		arcrole = newArcrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ARCROLE, oldArcrole, arcrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNilReason() {
		return nilReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNilReason(Object newNilReason) {
		Object oldNilReason = nilReason;
		nilReason = newNilReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShowType getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShow(ShowType newShow) {
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShow() {
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuidref() {
		return uuidref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuidref(String newUuidref) {
		String oldUuidref = uuidref;
		uuidref = newUuidref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__UUIDREF, oldUuidref, uuidref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION_GROUP:
				return ((InternalEList<?>)getMDCoverageDescriptionGroup()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION:
				return basicSetMDCoverageDescription(null, msgs);
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
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION_GROUP:
				if (coreType) return getMDCoverageDescriptionGroup();
				return ((FeatureMap.Internal)getMDCoverageDescriptionGroup()).getWrapper();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION:
				return getMDCoverageDescription();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ACTUATE:
				return getActuate();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ARCROLE:
				return getArcrole();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__HREF:
				return getHref();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__NIL_REASON:
				return getNilReason();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ROLE:
				return getRole();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__SHOW:
				return getShow();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TITLE:
				return getTitle();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TYPE:
				return getType();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__UUIDREF:
				return getUuidref();
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
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION_GROUP:
				((FeatureMap.Internal)getMDCoverageDescriptionGroup()).set(newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION:
				setMDCoverageDescription((MDCoverageDescriptionType)newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ARCROLE:
				setArcrole((String)newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__HREF:
				setHref((String)newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__NIL_REASON:
				setNilReason(newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TYPE:
				setType((TypeType)newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__UUIDREF:
				setUuidref((String)newValue);
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
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION_GROUP:
				getMDCoverageDescriptionGroup().clear();
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION:
				setMDCoverageDescription((MDCoverageDescriptionType)null);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ACTUATE:
				unsetActuate();
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__SHOW:
				unsetShow();
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TYPE:
				unsetType();
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__UUIDREF:
				setUuidref(UUIDREF_EDEFAULT);
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
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION_GROUP:
				return mDCoverageDescriptionGroup != null && !mDCoverageDescriptionGroup.isEmpty();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__MD_COVERAGE_DESCRIPTION:
				return getMDCoverageDescription() != null;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ACTUATE:
				return isSetActuate();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__SHOW:
				return isSetShow();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__TYPE:
				return isSetType();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE__UUIDREF:
				return UUIDREF_EDEFAULT == null ? uuidref != null : !UUIDREF_EDEFAULT.equals(uuidref);
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
		result.append(" (mDCoverageDescriptionGroup: ");
		result.append(mDCoverageDescriptionGroup);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", href: ");
		result.append(href);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(", role: ");
		result.append(role);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", uuidref: ");
		result.append(uuidref);
		result.append(')');
		return result.toString();
	}

} //MDCoverageDescriptionPropertyTypeImpl
