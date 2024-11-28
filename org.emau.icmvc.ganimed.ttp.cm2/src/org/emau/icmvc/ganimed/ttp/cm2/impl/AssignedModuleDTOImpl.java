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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus;
import org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assigned Module DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl#getDefaultConsentStatus <em>Default Consent Status</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl#getDisplayCheckboxes <em>Display Checkboxes</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignedModuleDTOImpl extends FhirIdDTOImpl implements AssignedModuleDTO {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultConsentStatus() <em>Default Consent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConsentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ConsentStatus DEFAULT_CONSENT_STATUS_EDEFAULT = ConsentStatus.ACCEPTED;

	/**
	 * The cached value of the '{@link #getDefaultConsentStatus() <em>Default Consent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConsentStatus()
	 * @generated
	 * @ordered
	 */
	protected ConsentStatus defaultConsentStatus = DEFAULT_CONSENT_STATUS_EDEFAULT;

	/**
	 * This is true if the Default Consent Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultConsentStatusESet;

	/**
	 * The cached value of the '{@link #getDisplayCheckboxes() <em>Display Checkboxes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayCheckboxes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentStatus> displayCheckboxes;

	/**
	 * The cached value of the '{@link #getExpirationProperties() <em>Expiration Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationProperties()
	 * @generated
	 * @ordered
	 */
	protected ExpirationPropertiesDTO expirationProperties;

	/**
	 * The default value of the '{@link #getExternProperties() <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERN_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternProperties() <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternProperties()
	 * @generated
	 * @ordered
	 */
	protected String externProperties = EXTERN_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * This is true if the Mandatory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mandatoryESet;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected ModuleDTO module;

	/**
	 * The default value of the '{@link #getOrderNumber() <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrderNumber() <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected int orderNumber = ORDER_NUMBER_EDEFAULT;

	/**
	 * This is true if the Order Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderNumberESet;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ModuleKeyDTO parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedModuleDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getAssignedModuleDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentStatus getDefaultConsentStatus() {
		return defaultConsentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultConsentStatus(ConsentStatus newDefaultConsentStatus) {
		ConsentStatus oldDefaultConsentStatus = defaultConsentStatus;
		defaultConsentStatus = newDefaultConsentStatus == null ? DEFAULT_CONSENT_STATUS_EDEFAULT : newDefaultConsentStatus;
		boolean oldDefaultConsentStatusESet = defaultConsentStatusESet;
		defaultConsentStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__DEFAULT_CONSENT_STATUS, oldDefaultConsentStatus, defaultConsentStatus, !oldDefaultConsentStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDefaultConsentStatus() {
		ConsentStatus oldDefaultConsentStatus = defaultConsentStatus;
		boolean oldDefaultConsentStatusESet = defaultConsentStatusESet;
		defaultConsentStatus = DEFAULT_CONSENT_STATUS_EDEFAULT;
		defaultConsentStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.ASSIGNED_MODULE_DTO__DEFAULT_CONSENT_STATUS, oldDefaultConsentStatus, DEFAULT_CONSENT_STATUS_EDEFAULT, oldDefaultConsentStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDefaultConsentStatus() {
		return defaultConsentStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentStatus> getDisplayCheckboxes() {
		if (displayCheckboxes == null) {
			displayCheckboxes = new EDataTypeEList<ConsentStatus>(ConsentStatus.class, this, Cm2Package.ASSIGNED_MODULE_DTO__DISPLAY_CHECKBOXES);
		}
		return displayCheckboxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpirationPropertiesDTO getExpirationProperties() {
		return expirationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationProperties(ExpirationPropertiesDTO newExpirationProperties, NotificationChain msgs) {
		ExpirationPropertiesDTO oldExpirationProperties = expirationProperties;
		expirationProperties = newExpirationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES, oldExpirationProperties, newExpirationProperties);
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
	public void setExpirationProperties(ExpirationPropertiesDTO newExpirationProperties) {
		if (newExpirationProperties != expirationProperties) {
			NotificationChain msgs = null;
			if (expirationProperties != null)
				msgs = ((InternalEObject)expirationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES, null, msgs);
			if (newExpirationProperties != null)
				msgs = ((InternalEObject)newExpirationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES, null, msgs);
			msgs = basicSetExpirationProperties(newExpirationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES, newExpirationProperties, newExpirationProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternProperties() {
		return externProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternProperties(String newExternProperties) {
		String oldExternProperties = externProperties;
		externProperties = newExternProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__EXTERN_PROPERTIES, oldExternProperties, externProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		boolean oldMandatoryESet = mandatoryESet;
		mandatoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__MANDATORY, oldMandatory, mandatory, !oldMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMandatory() {
		boolean oldMandatory = mandatory;
		boolean oldMandatoryESet = mandatoryESet;
		mandatory = MANDATORY_EDEFAULT;
		mandatoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.ASSIGNED_MODULE_DTO__MANDATORY, oldMandatory, MANDATORY_EDEFAULT, oldMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMandatory() {
		return mandatoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleDTO getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(ModuleDTO newModule, NotificationChain msgs) {
		ModuleDTO oldModule = module;
		module = newModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__MODULE, oldModule, newModule);
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
	public void setModule(ModuleDTO newModule) {
		if (newModule != module) {
			NotificationChain msgs = null;
			if (module != null)
				msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ASSIGNED_MODULE_DTO__MODULE, null, msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ASSIGNED_MODULE_DTO__MODULE, null, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderNumber(int newOrderNumber) {
		int oldOrderNumber = orderNumber;
		orderNumber = newOrderNumber;
		boolean oldOrderNumberESet = orderNumberESet;
		orderNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__ORDER_NUMBER, oldOrderNumber, orderNumber, !oldOrderNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrderNumber() {
		int oldOrderNumber = orderNumber;
		boolean oldOrderNumberESet = orderNumberESet;
		orderNumber = ORDER_NUMBER_EDEFAULT;
		orderNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.ASSIGNED_MODULE_DTO__ORDER_NUMBER, oldOrderNumber, ORDER_NUMBER_EDEFAULT, oldOrderNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOrderNumber() {
		return orderNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleKeyDTO getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ModuleKeyDTO newParent, NotificationChain msgs) {
		ModuleKeyDTO oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__PARENT, oldParent, newParent);
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
	public void setParent(ModuleKeyDTO newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ASSIGNED_MODULE_DTO__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ASSIGNED_MODULE_DTO__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_MODULE_DTO__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES:
				return basicSetExpirationProperties(null, msgs);
			case Cm2Package.ASSIGNED_MODULE_DTO__MODULE:
				return basicSetModule(null, msgs);
			case Cm2Package.ASSIGNED_MODULE_DTO__PARENT:
				return basicSetParent(null, msgs);
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
			case Cm2Package.ASSIGNED_MODULE_DTO__COMMENT:
				return getComment();
			case Cm2Package.ASSIGNED_MODULE_DTO__DEFAULT_CONSENT_STATUS:
				return getDefaultConsentStatus();
			case Cm2Package.ASSIGNED_MODULE_DTO__DISPLAY_CHECKBOXES:
				return getDisplayCheckboxes();
			case Cm2Package.ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES:
				return getExpirationProperties();
			case Cm2Package.ASSIGNED_MODULE_DTO__EXTERN_PROPERTIES:
				return getExternProperties();
			case Cm2Package.ASSIGNED_MODULE_DTO__MANDATORY:
				return isMandatory();
			case Cm2Package.ASSIGNED_MODULE_DTO__MODULE:
				return getModule();
			case Cm2Package.ASSIGNED_MODULE_DTO__ORDER_NUMBER:
				return getOrderNumber();
			case Cm2Package.ASSIGNED_MODULE_DTO__PARENT:
				return getParent();
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
			case Cm2Package.ASSIGNED_MODULE_DTO__COMMENT:
				setComment((String)newValue);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__DEFAULT_CONSENT_STATUS:
				setDefaultConsentStatus((ConsentStatus)newValue);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__DISPLAY_CHECKBOXES:
				getDisplayCheckboxes().clear();
				getDisplayCheckboxes().addAll((Collection<? extends ConsentStatus>)newValue);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)newValue);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__EXTERN_PROPERTIES:
				setExternProperties((String)newValue);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__MODULE:
				setModule((ModuleDTO)newValue);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__ORDER_NUMBER:
				setOrderNumber((Integer)newValue);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__PARENT:
				setParent((ModuleKeyDTO)newValue);
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
			case Cm2Package.ASSIGNED_MODULE_DTO__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__DEFAULT_CONSENT_STATUS:
				unsetDefaultConsentStatus();
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__DISPLAY_CHECKBOXES:
				getDisplayCheckboxes().clear();
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)null);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__EXTERN_PROPERTIES:
				setExternProperties(EXTERN_PROPERTIES_EDEFAULT);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__MANDATORY:
				unsetMandatory();
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__MODULE:
				setModule((ModuleDTO)null);
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__ORDER_NUMBER:
				unsetOrderNumber();
				return;
			case Cm2Package.ASSIGNED_MODULE_DTO__PARENT:
				setParent((ModuleKeyDTO)null);
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
			case Cm2Package.ASSIGNED_MODULE_DTO__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Cm2Package.ASSIGNED_MODULE_DTO__DEFAULT_CONSENT_STATUS:
				return isSetDefaultConsentStatus();
			case Cm2Package.ASSIGNED_MODULE_DTO__DISPLAY_CHECKBOXES:
				return displayCheckboxes != null && !displayCheckboxes.isEmpty();
			case Cm2Package.ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES:
				return expirationProperties != null;
			case Cm2Package.ASSIGNED_MODULE_DTO__EXTERN_PROPERTIES:
				return EXTERN_PROPERTIES_EDEFAULT == null ? externProperties != null : !EXTERN_PROPERTIES_EDEFAULT.equals(externProperties);
			case Cm2Package.ASSIGNED_MODULE_DTO__MANDATORY:
				return isSetMandatory();
			case Cm2Package.ASSIGNED_MODULE_DTO__MODULE:
				return module != null;
			case Cm2Package.ASSIGNED_MODULE_DTO__ORDER_NUMBER:
				return isSetOrderNumber();
			case Cm2Package.ASSIGNED_MODULE_DTO__PARENT:
				return parent != null;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", defaultConsentStatus: ");
		if (defaultConsentStatusESet) result.append(defaultConsentStatus); else result.append("<unset>");
		result.append(", displayCheckboxes: ");
		result.append(displayCheckboxes);
		result.append(", externProperties: ");
		result.append(externProperties);
		result.append(", mandatory: ");
		if (mandatoryESet) result.append(mandatory); else result.append("<unset>");
		result.append(", orderNumber: ");
		if (orderNumberESet) result.append(orderNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AssignedModuleDTOImpl
