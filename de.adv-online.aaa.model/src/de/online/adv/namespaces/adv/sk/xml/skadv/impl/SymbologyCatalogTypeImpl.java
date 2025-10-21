/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.LayerType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PresentationLogicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbology Catalog Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SymbologyCatalogTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SymbologyCatalogTypeImpl#getVersionGeoInfoDok <em>Version Geo Info Dok</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SymbologyCatalogTypeImpl#getDateOfIssue <em>Date Of Issue</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SymbologyCatalogTypeImpl#getPresentationLogic <em>Presentation Logic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SymbologyCatalogTypeImpl#getMapLengthFactor <em>Map Length Factor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SymbologyCatalogTypeImpl#getMapCharSizeFactor <em>Map Char Size Factor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SymbologyCatalogTypeImpl#getMapAngleFactor <em>Map Angle Factor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SymbologyCatalogTypeImpl#getLayer <em>Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbologyCatalogTypeImpl extends ElementType1Impl implements SymbologyCatalogType {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionGeoInfoDok() <em>Version Geo Info Dok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionGeoInfoDok()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_GEO_INFO_DOK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionGeoInfoDok() <em>Version Geo Info Dok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionGeoInfoDok()
	 * @generated
	 * @ordered
	 */
	protected String versionGeoInfoDok = VERSION_GEO_INFO_DOK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfIssue() <em>Date Of Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfIssue()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_OF_ISSUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfIssue() <em>Date Of Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfIssue()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateOfIssue = DATE_OF_ISSUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentationLogic() <em>Presentation Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationLogic()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationLogicType PRESENTATION_LOGIC_EDEFAULT = PresentationLogicType.ALKIS;

	/**
	 * The cached value of the '{@link #getPresentationLogic() <em>Presentation Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationLogic()
	 * @generated
	 * @ordered
	 */
	protected PresentationLogicType presentationLogic = PRESENTATION_LOGIC_EDEFAULT;

	/**
	 * This is true if the Presentation Logic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean presentationLogicESet;

	/**
	 * The default value of the '{@link #getMapLengthFactor() <em>Map Length Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLengthFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double MAP_LENGTH_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMapLengthFactor() <em>Map Length Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLengthFactor()
	 * @generated
	 * @ordered
	 */
	protected double mapLengthFactor = MAP_LENGTH_FACTOR_EDEFAULT;

	/**
	 * This is true if the Map Length Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mapLengthFactorESet;

	/**
	 * The default value of the '{@link #getMapCharSizeFactor() <em>Map Char Size Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapCharSizeFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double MAP_CHAR_SIZE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMapCharSizeFactor() <em>Map Char Size Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapCharSizeFactor()
	 * @generated
	 * @ordered
	 */
	protected double mapCharSizeFactor = MAP_CHAR_SIZE_FACTOR_EDEFAULT;

	/**
	 * This is true if the Map Char Size Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mapCharSizeFactorESet;

	/**
	 * The default value of the '{@link #getMapAngleFactor() <em>Map Angle Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapAngleFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double MAP_ANGLE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMapAngleFactor() <em>Map Angle Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapAngleFactor()
	 * @generated
	 * @ordered
	 */
	protected double mapAngleFactor = MAP_ANGLE_FACTOR_EDEFAULT;

	/**
	 * This is true if the Map Angle Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mapAngleFactorESet;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<LayerType> layer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbologyCatalogTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getSymbologyCatalogType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionGeoInfoDok() {
		return versionGeoInfoDok;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionGeoInfoDok(String newVersionGeoInfoDok) {
		String oldVersionGeoInfoDok = versionGeoInfoDok;
		versionGeoInfoDok = newVersionGeoInfoDok;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__VERSION_GEO_INFO_DOK, oldVersionGeoInfoDok, versionGeoInfoDok));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDateOfIssue() {
		return dateOfIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateOfIssue(XMLGregorianCalendar newDateOfIssue) {
		XMLGregorianCalendar oldDateOfIssue = dateOfIssue;
		dateOfIssue = newDateOfIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__DATE_OF_ISSUE, oldDateOfIssue, dateOfIssue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PresentationLogicType getPresentationLogic() {
		return presentationLogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresentationLogic(PresentationLogicType newPresentationLogic) {
		PresentationLogicType oldPresentationLogic = presentationLogic;
		presentationLogic = newPresentationLogic == null ? PRESENTATION_LOGIC_EDEFAULT : newPresentationLogic;
		boolean oldPresentationLogicESet = presentationLogicESet;
		presentationLogicESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__PRESENTATION_LOGIC, oldPresentationLogic, presentationLogic, !oldPresentationLogicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPresentationLogic() {
		PresentationLogicType oldPresentationLogic = presentationLogic;
		boolean oldPresentationLogicESet = presentationLogicESet;
		presentationLogic = PRESENTATION_LOGIC_EDEFAULT;
		presentationLogicESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__PRESENTATION_LOGIC, oldPresentationLogic, PRESENTATION_LOGIC_EDEFAULT, oldPresentationLogicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPresentationLogic() {
		return presentationLogicESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMapLengthFactor() {
		return mapLengthFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapLengthFactor(double newMapLengthFactor) {
		double oldMapLengthFactor = mapLengthFactor;
		mapLengthFactor = newMapLengthFactor;
		boolean oldMapLengthFactorESet = mapLengthFactorESet;
		mapLengthFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_LENGTH_FACTOR, oldMapLengthFactor, mapLengthFactor, !oldMapLengthFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMapLengthFactor() {
		double oldMapLengthFactor = mapLengthFactor;
		boolean oldMapLengthFactorESet = mapLengthFactorESet;
		mapLengthFactor = MAP_LENGTH_FACTOR_EDEFAULT;
		mapLengthFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_LENGTH_FACTOR, oldMapLengthFactor, MAP_LENGTH_FACTOR_EDEFAULT, oldMapLengthFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMapLengthFactor() {
		return mapLengthFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMapCharSizeFactor() {
		return mapCharSizeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapCharSizeFactor(double newMapCharSizeFactor) {
		double oldMapCharSizeFactor = mapCharSizeFactor;
		mapCharSizeFactor = newMapCharSizeFactor;
		boolean oldMapCharSizeFactorESet = mapCharSizeFactorESet;
		mapCharSizeFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_CHAR_SIZE_FACTOR, oldMapCharSizeFactor, mapCharSizeFactor, !oldMapCharSizeFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMapCharSizeFactor() {
		double oldMapCharSizeFactor = mapCharSizeFactor;
		boolean oldMapCharSizeFactorESet = mapCharSizeFactorESet;
		mapCharSizeFactor = MAP_CHAR_SIZE_FACTOR_EDEFAULT;
		mapCharSizeFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_CHAR_SIZE_FACTOR, oldMapCharSizeFactor, MAP_CHAR_SIZE_FACTOR_EDEFAULT, oldMapCharSizeFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMapCharSizeFactor() {
		return mapCharSizeFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMapAngleFactor() {
		return mapAngleFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapAngleFactor(double newMapAngleFactor) {
		double oldMapAngleFactor = mapAngleFactor;
		mapAngleFactor = newMapAngleFactor;
		boolean oldMapAngleFactorESet = mapAngleFactorESet;
		mapAngleFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_ANGLE_FACTOR, oldMapAngleFactor, mapAngleFactor, !oldMapAngleFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMapAngleFactor() {
		double oldMapAngleFactor = mapAngleFactor;
		boolean oldMapAngleFactorESet = mapAngleFactorESet;
		mapAngleFactor = MAP_ANGLE_FACTOR_EDEFAULT;
		mapAngleFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_ANGLE_FACTOR, oldMapAngleFactor, MAP_ANGLE_FACTOR_EDEFAULT, oldMapAngleFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMapAngleFactor() {
		return mapAngleFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LayerType> getLayer() {
		if (layer == null) {
			layer = new EObjectContainmentEList<LayerType>(LayerType.class, this, AAAPackage.SYMBOLOGY_CATALOG_TYPE__LAYER);
		}
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__LAYER:
				return ((InternalEList<?>)getLayer()).basicRemove(otherEnd, msgs);
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
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__VERSION:
				return getVersion();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__VERSION_GEO_INFO_DOK:
				return getVersionGeoInfoDok();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__DATE_OF_ISSUE:
				return getDateOfIssue();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__PRESENTATION_LOGIC:
				return getPresentationLogic();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_LENGTH_FACTOR:
				return getMapLengthFactor();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_CHAR_SIZE_FACTOR:
				return getMapCharSizeFactor();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_ANGLE_FACTOR:
				return getMapAngleFactor();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__LAYER:
				return getLayer();
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
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__VERSION_GEO_INFO_DOK:
				setVersionGeoInfoDok((String)newValue);
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__DATE_OF_ISSUE:
				setDateOfIssue((XMLGregorianCalendar)newValue);
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__PRESENTATION_LOGIC:
				setPresentationLogic((PresentationLogicType)newValue);
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_LENGTH_FACTOR:
				setMapLengthFactor((Double)newValue);
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_CHAR_SIZE_FACTOR:
				setMapCharSizeFactor((Double)newValue);
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_ANGLE_FACTOR:
				setMapAngleFactor((Double)newValue);
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__LAYER:
				getLayer().clear();
				getLayer().addAll((Collection<? extends LayerType>)newValue);
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
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__VERSION_GEO_INFO_DOK:
				setVersionGeoInfoDok(VERSION_GEO_INFO_DOK_EDEFAULT);
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__DATE_OF_ISSUE:
				setDateOfIssue(DATE_OF_ISSUE_EDEFAULT);
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__PRESENTATION_LOGIC:
				unsetPresentationLogic();
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_LENGTH_FACTOR:
				unsetMapLengthFactor();
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_CHAR_SIZE_FACTOR:
				unsetMapCharSizeFactor();
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_ANGLE_FACTOR:
				unsetMapAngleFactor();
				return;
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__LAYER:
				getLayer().clear();
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
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__VERSION_GEO_INFO_DOK:
				return VERSION_GEO_INFO_DOK_EDEFAULT == null ? versionGeoInfoDok != null : !VERSION_GEO_INFO_DOK_EDEFAULT.equals(versionGeoInfoDok);
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__DATE_OF_ISSUE:
				return DATE_OF_ISSUE_EDEFAULT == null ? dateOfIssue != null : !DATE_OF_ISSUE_EDEFAULT.equals(dateOfIssue);
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__PRESENTATION_LOGIC:
				return isSetPresentationLogic();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_LENGTH_FACTOR:
				return isSetMapLengthFactor();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_CHAR_SIZE_FACTOR:
				return isSetMapCharSizeFactor();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__MAP_ANGLE_FACTOR:
				return isSetMapAngleFactor();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE__LAYER:
				return layer != null && !layer.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(", versionGeoInfoDok: ");
		result.append(versionGeoInfoDok);
		result.append(", dateOfIssue: ");
		result.append(dateOfIssue);
		result.append(", presentationLogic: ");
		if (presentationLogicESet) result.append(presentationLogic); else result.append("<unset>");
		result.append(", mapLengthFactor: ");
		if (mapLengthFactorESet) result.append(mapLengthFactor); else result.append("<unset>");
		result.append(", mapCharSizeFactor: ");
		if (mapCharSizeFactorESet) result.append(mapCharSizeFactor); else result.append("<unset>");
		result.append(", mapAngleFactor: ");
		if (mapAngleFactorESet) result.append(mapAngleFactor); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SymbologyCatalogTypeImpl
