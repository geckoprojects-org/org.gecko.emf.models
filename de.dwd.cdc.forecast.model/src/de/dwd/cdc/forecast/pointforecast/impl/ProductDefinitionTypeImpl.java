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
package de.dwd.cdc.forecast.pointforecast.impl;

import de.dwd.cdc.forecast.pointforecast.ForecastTimeStepsType;
import de.dwd.cdc.forecast.pointforecast.FormatCfgType;
import de.dwd.cdc.forecast.pointforecast.PointforecastPackage;
import de.dwd.cdc.forecast.pointforecast.ProductDefinitionType;
import de.dwd.cdc.forecast.pointforecast.ProductIDType;
import de.dwd.cdc.forecast.pointforecast.ReferencedModelType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl#getGeneratingProcess <em>Generating Process</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl#getReferencedModel <em>Referenced Model</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl#getForecastTimeSteps <em>Forecast Time Steps</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl#getFormatCfg <em>Format Cfg</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl#getMetElementDefinition <em>Met Element Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductDefinitionTypeImpl extends MinimalEObjectImpl.Container implements ProductDefinitionType {
	/**
	 * The default value of the '{@link #getIssuer() <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected String issuer = ISSUER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected static final ProductIDType PRODUCT_ID_EDEFAULT = ProductIDType.EZMOS;

	/**
	 * The cached value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected ProductIDType productID = PRODUCT_ID_EDEFAULT;

	/**
	 * This is true if the Product ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean productIDESet;

	/**
	 * The default value of the '{@link #getGeneratingProcess() <em>Generating Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingProcess()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATING_PROCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratingProcess() <em>Generating Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingProcess()
	 * @generated
	 * @ordered
	 */
	protected String generatingProcess = GENERATING_PROCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssueTime() <em>Issue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ISSUE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueTime() <em>Issue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar issueTime = ISSUE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedModel() <em>Referenced Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedModel()
	 * @generated
	 * @ordered
	 */
	protected ReferencedModelType referencedModel;

	/**
	 * The cached value of the '{@link #getForecastTimeSteps() <em>Forecast Time Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastTimeSteps()
	 * @generated
	 * @ordered
	 */
	protected ForecastTimeStepsType forecastTimeSteps;

	/**
	 * The cached value of the '{@link #getFormatCfg() <em>Format Cfg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatCfg()
	 * @generated
	 * @ordered
	 */
	protected FormatCfgType formatCfg;

	/**
	 * The default value of the '{@link #getMetElementDefinition() <em>Met Element Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetElementDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String MET_ELEMENT_DEFINITION_EDEFAULT = "https://opendata.dwd.de/weather/lib/MetElementDefinition.xml";

	/**
	 * The cached value of the '{@link #getMetElementDefinition() <em>Met Element Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetElementDefinition()
	 * @generated
	 * @ordered
	 */
	protected String metElementDefinition = MET_ELEMENT_DEFINITION_EDEFAULT;

	/**
	 * This is true if the Met Element Definition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean metElementDefinitionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PointforecastPackage.Literals.PRODUCT_DEFINITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssuer() {
		return issuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuer(String newIssuer) {
		String oldIssuer = issuer;
		issuer = newIssuer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__ISSUER, oldIssuer, issuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductIDType getProductID() {
		return productID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductID(ProductIDType newProductID) {
		ProductIDType oldProductID = productID;
		productID = newProductID == null ? PRODUCT_ID_EDEFAULT : newProductID;
		boolean oldProductIDESet = productIDESet;
		productIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__PRODUCT_ID, oldProductID, productID, !oldProductIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProductID() {
		ProductIDType oldProductID = productID;
		boolean oldProductIDESet = productIDESet;
		productID = PRODUCT_ID_EDEFAULT;
		productIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__PRODUCT_ID, oldProductID, PRODUCT_ID_EDEFAULT, oldProductIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProductID() {
		return productIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratingProcess() {
		return generatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneratingProcess(String newGeneratingProcess) {
		String oldGeneratingProcess = generatingProcess;
		generatingProcess = newGeneratingProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__GENERATING_PROCESS, oldGeneratingProcess, generatingProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getIssueTime() {
		return issueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueTime(XMLGregorianCalendar newIssueTime) {
		XMLGregorianCalendar oldIssueTime = issueTime;
		issueTime = newIssueTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__ISSUE_TIME, oldIssueTime, issueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencedModelType getReferencedModel() {
		return referencedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedModel(ReferencedModelType newReferencedModel, NotificationChain msgs) {
		ReferencedModelType oldReferencedModel = referencedModel;
		referencedModel = newReferencedModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL, oldReferencedModel, newReferencedModel);
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
	public void setReferencedModel(ReferencedModelType newReferencedModel) {
		if (newReferencedModel != referencedModel) {
			NotificationChain msgs = null;
			if (referencedModel != null)
				msgs = ((InternalEObject)referencedModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PointforecastPackage.PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL, null, msgs);
			if (newReferencedModel != null)
				msgs = ((InternalEObject)newReferencedModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PointforecastPackage.PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL, null, msgs);
			msgs = basicSetReferencedModel(newReferencedModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL, newReferencedModel, newReferencedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForecastTimeStepsType getForecastTimeSteps() {
		return forecastTimeSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecastTimeSteps(ForecastTimeStepsType newForecastTimeSteps, NotificationChain msgs) {
		ForecastTimeStepsType oldForecastTimeSteps = forecastTimeSteps;
		forecastTimeSteps = newForecastTimeSteps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS, oldForecastTimeSteps, newForecastTimeSteps);
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
	public void setForecastTimeSteps(ForecastTimeStepsType newForecastTimeSteps) {
		if (newForecastTimeSteps != forecastTimeSteps) {
			NotificationChain msgs = null;
			if (forecastTimeSteps != null)
				msgs = ((InternalEObject)forecastTimeSteps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS, null, msgs);
			if (newForecastTimeSteps != null)
				msgs = ((InternalEObject)newForecastTimeSteps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS, null, msgs);
			msgs = basicSetForecastTimeSteps(newForecastTimeSteps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS, newForecastTimeSteps, newForecastTimeSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormatCfgType getFormatCfg() {
		return formatCfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormatCfg(FormatCfgType newFormatCfg, NotificationChain msgs) {
		FormatCfgType oldFormatCfg = formatCfg;
		formatCfg = newFormatCfg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORMAT_CFG, oldFormatCfg, newFormatCfg);
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
	public void setFormatCfg(FormatCfgType newFormatCfg) {
		if (newFormatCfg != formatCfg) {
			NotificationChain msgs = null;
			if (formatCfg != null)
				msgs = ((InternalEObject)formatCfg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORMAT_CFG, null, msgs);
			if (newFormatCfg != null)
				msgs = ((InternalEObject)newFormatCfg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORMAT_CFG, null, msgs);
			msgs = basicSetFormatCfg(newFormatCfg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORMAT_CFG, newFormatCfg, newFormatCfg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetElementDefinition() {
		return metElementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetElementDefinition(String newMetElementDefinition) {
		String oldMetElementDefinition = metElementDefinition;
		metElementDefinition = newMetElementDefinition;
		boolean oldMetElementDefinitionESet = metElementDefinitionESet;
		metElementDefinitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__MET_ELEMENT_DEFINITION, oldMetElementDefinition, metElementDefinition, !oldMetElementDefinitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMetElementDefinition() {
		String oldMetElementDefinition = metElementDefinition;
		boolean oldMetElementDefinitionESet = metElementDefinitionESet;
		metElementDefinition = MET_ELEMENT_DEFINITION_EDEFAULT;
		metElementDefinitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PointforecastPackage.PRODUCT_DEFINITION_TYPE__MET_ELEMENT_DEFINITION, oldMetElementDefinition, MET_ELEMENT_DEFINITION_EDEFAULT, oldMetElementDefinitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMetElementDefinition() {
		return metElementDefinitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL:
				return basicSetReferencedModel(null, msgs);
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS:
				return basicSetForecastTimeSteps(null, msgs);
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORMAT_CFG:
				return basicSetFormatCfg(null, msgs);
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
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__ISSUER:
				return getIssuer();
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__PRODUCT_ID:
				return getProductID();
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__GENERATING_PROCESS:
				return getGeneratingProcess();
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__ISSUE_TIME:
				return getIssueTime();
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL:
				return getReferencedModel();
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS:
				return getForecastTimeSteps();
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORMAT_CFG:
				return getFormatCfg();
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__MET_ELEMENT_DEFINITION:
				return getMetElementDefinition();
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
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__ISSUER:
				setIssuer((String)newValue);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__PRODUCT_ID:
				setProductID((ProductIDType)newValue);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__GENERATING_PROCESS:
				setGeneratingProcess((String)newValue);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__ISSUE_TIME:
				setIssueTime((XMLGregorianCalendar)newValue);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL:
				setReferencedModel((ReferencedModelType)newValue);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS:
				setForecastTimeSteps((ForecastTimeStepsType)newValue);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORMAT_CFG:
				setFormatCfg((FormatCfgType)newValue);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__MET_ELEMENT_DEFINITION:
				setMetElementDefinition((String)newValue);
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
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__ISSUER:
				setIssuer(ISSUER_EDEFAULT);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__PRODUCT_ID:
				unsetProductID();
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__GENERATING_PROCESS:
				setGeneratingProcess(GENERATING_PROCESS_EDEFAULT);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__ISSUE_TIME:
				setIssueTime(ISSUE_TIME_EDEFAULT);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL:
				setReferencedModel((ReferencedModelType)null);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS:
				setForecastTimeSteps((ForecastTimeStepsType)null);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORMAT_CFG:
				setFormatCfg((FormatCfgType)null);
				return;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__MET_ELEMENT_DEFINITION:
				unsetMetElementDefinition();
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
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__ISSUER:
				return ISSUER_EDEFAULT == null ? issuer != null : !ISSUER_EDEFAULT.equals(issuer);
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__PRODUCT_ID:
				return isSetProductID();
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__GENERATING_PROCESS:
				return GENERATING_PROCESS_EDEFAULT == null ? generatingProcess != null : !GENERATING_PROCESS_EDEFAULT.equals(generatingProcess);
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__ISSUE_TIME:
				return ISSUE_TIME_EDEFAULT == null ? issueTime != null : !ISSUE_TIME_EDEFAULT.equals(issueTime);
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL:
				return referencedModel != null;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS:
				return forecastTimeSteps != null;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__FORMAT_CFG:
				return formatCfg != null;
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE__MET_ELEMENT_DEFINITION:
				return isSetMetElementDefinition();
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
		result.append(" (issuer: ");
		result.append(issuer);
		result.append(", productID: ");
		if (productIDESet) result.append(productID); else result.append("<unset>");
		result.append(", generatingProcess: ");
		result.append(generatingProcess);
		result.append(", issueTime: ");
		result.append(issueTime);
		result.append(", metElementDefinition: ");
		if (metElementDefinitionESet) result.append(metElementDefinition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProductDefinitionTypeImpl
