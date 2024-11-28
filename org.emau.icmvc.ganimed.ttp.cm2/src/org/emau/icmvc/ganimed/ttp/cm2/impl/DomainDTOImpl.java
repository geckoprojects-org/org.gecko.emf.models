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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.DomainDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO;

import org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getCtVersionConverter <em>Ct Version Converter</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#isFinalised <em>Finalised</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getLogo <em>Logo</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getModuleVersionConverter <em>Module Version Converter</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getPolicyVersionConverter <em>Policy Version Converter</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getSignerIdTypes <em>Signer Id Types</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl#getUpdateDate <em>Update Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainDTOImpl extends FhirIdDTOImpl implements DomainDTO {
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
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected DomainConfig config;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCtVersionConverter() <em>Ct Version Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtVersionConverter()
	 * @generated
	 * @ordered
	 */
	protected static final String CT_VERSION_CONVERTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCtVersionConverter() <em>Ct Version Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtVersionConverter()
	 * @generated
	 * @ordered
	 */
	protected String ctVersionConverter = CT_VERSION_CONVERTER_EDEFAULT;

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
	 * The default value of the '{@link #isFinalised() <em>Finalised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINALISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinalised() <em>Finalised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalised()
	 * @generated
	 * @ordered
	 */
	protected boolean finalised = FINALISED_EDEFAULT;

	/**
	 * This is true if the Finalised attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finalisedESet;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected String logo = LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleVersionConverter() <em>Module Version Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleVersionConverter()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_VERSION_CONVERTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleVersionConverter() <em>Module Version Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleVersionConverter()
	 * @generated
	 * @ordered
	 */
	protected String moduleVersionConverter = MODULE_VERSION_CONVERTER_EDEFAULT;

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
	 * The default value of the '{@link #getPolicyVersionConverter() <em>Policy Version Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyVersionConverter()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_VERSION_CONVERTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyVersionConverter() <em>Policy Version Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyVersionConverter()
	 * @generated
	 * @ordered
	 */
	protected String policyVersionConverter = POLICY_VERSION_CONVERTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignerIdTypes() <em>Signer Id Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignerIdTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> signerIdTypes;

	/**
	 * The default value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar UPDATE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar updateDate = UPDATE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getDomainDTO();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainConfig getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(DomainConfig newConfig, NotificationChain msgs) {
		DomainConfig oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__CONFIG, oldConfig, newConfig);
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
	public void setConfig(DomainConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.DOMAIN_DTO__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.DOMAIN_DTO__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCtVersionConverter() {
		return ctVersionConverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCtVersionConverter(String newCtVersionConverter) {
		String oldCtVersionConverter = ctVersionConverter;
		ctVersionConverter = newCtVersionConverter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__CT_VERSION_CONVERTER, oldCtVersionConverter, ctVersionConverter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__EXPIRATION_PROPERTIES, oldExpirationProperties, newExpirationProperties);
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
				msgs = ((InternalEObject)expirationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.DOMAIN_DTO__EXPIRATION_PROPERTIES, null, msgs);
			if (newExpirationProperties != null)
				msgs = ((InternalEObject)newExpirationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.DOMAIN_DTO__EXPIRATION_PROPERTIES, null, msgs);
			msgs = basicSetExpirationProperties(newExpirationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__EXPIRATION_PROPERTIES, newExpirationProperties, newExpirationProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__EXTERN_PROPERTIES, oldExternProperties, externProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFinalised() {
		return finalised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinalised(boolean newFinalised) {
		boolean oldFinalised = finalised;
		finalised = newFinalised;
		boolean oldFinalisedESet = finalisedESet;
		finalisedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__FINALISED, oldFinalised, finalised, !oldFinalisedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFinalised() {
		boolean oldFinalised = finalised;
		boolean oldFinalisedESet = finalisedESet;
		finalised = FINALISED_EDEFAULT;
		finalisedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.DOMAIN_DTO__FINALISED, oldFinalised, FINALISED_EDEFAULT, oldFinalisedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFinalised() {
		return finalisedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogo() {
		return logo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogo(String newLogo) {
		String oldLogo = logo;
		logo = newLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__LOGO, oldLogo, logo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModuleVersionConverter() {
		return moduleVersionConverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleVersionConverter(String newModuleVersionConverter) {
		String oldModuleVersionConverter = moduleVersionConverter;
		moduleVersionConverter = newModuleVersionConverter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__MODULE_VERSION_CONVERTER, oldModuleVersionConverter, moduleVersionConverter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyVersionConverter() {
		return policyVersionConverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyVersionConverter(String newPolicyVersionConverter) {
		String oldPolicyVersionConverter = policyVersionConverter;
		policyVersionConverter = newPolicyVersionConverter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__POLICY_VERSION_CONVERTER, oldPolicyVersionConverter, policyVersionConverter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSignerIdTypes() {
		if (signerIdTypes == null) {
			signerIdTypes = new EDataTypeEList<String>(String.class, this, Cm2Package.DOMAIN_DTO__SIGNER_ID_TYPES);
		}
		return signerIdTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getUpdateDate() {
		return updateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateDate(XMLGregorianCalendar newUpdateDate) {
		XMLGregorianCalendar oldUpdateDate = updateDate;
		updateDate = newUpdateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DOMAIN_DTO__UPDATE_DATE, oldUpdateDate, updateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.DOMAIN_DTO__CONFIG:
				return basicSetConfig(null, msgs);
			case Cm2Package.DOMAIN_DTO__EXPIRATION_PROPERTIES:
				return basicSetExpirationProperties(null, msgs);
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
			case Cm2Package.DOMAIN_DTO__COMMENT:
				return getComment();
			case Cm2Package.DOMAIN_DTO__CONFIG:
				return getConfig();
			case Cm2Package.DOMAIN_DTO__CREATION_DATE:
				return getCreationDate();
			case Cm2Package.DOMAIN_DTO__CT_VERSION_CONVERTER:
				return getCtVersionConverter();
			case Cm2Package.DOMAIN_DTO__EXPIRATION_PROPERTIES:
				return getExpirationProperties();
			case Cm2Package.DOMAIN_DTO__EXTERN_PROPERTIES:
				return getExternProperties();
			case Cm2Package.DOMAIN_DTO__FINALISED:
				return isFinalised();
			case Cm2Package.DOMAIN_DTO__LABEL:
				return getLabel();
			case Cm2Package.DOMAIN_DTO__LOGO:
				return getLogo();
			case Cm2Package.DOMAIN_DTO__MODULE_VERSION_CONVERTER:
				return getModuleVersionConverter();
			case Cm2Package.DOMAIN_DTO__NAME:
				return getName();
			case Cm2Package.DOMAIN_DTO__POLICY_VERSION_CONVERTER:
				return getPolicyVersionConverter();
			case Cm2Package.DOMAIN_DTO__SIGNER_ID_TYPES:
				return getSignerIdTypes();
			case Cm2Package.DOMAIN_DTO__UPDATE_DATE:
				return getUpdateDate();
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
			case Cm2Package.DOMAIN_DTO__COMMENT:
				setComment((String)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__CONFIG:
				setConfig((DomainConfig)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__CT_VERSION_CONVERTER:
				setCtVersionConverter((String)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__EXTERN_PROPERTIES:
				setExternProperties((String)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__FINALISED:
				setFinalised((Boolean)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__LABEL:
				setLabel((String)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__LOGO:
				setLogo((String)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__MODULE_VERSION_CONVERTER:
				setModuleVersionConverter((String)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__NAME:
				setName((String)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__POLICY_VERSION_CONVERTER:
				setPolicyVersionConverter((String)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__SIGNER_ID_TYPES:
				getSignerIdTypes().clear();
				getSignerIdTypes().addAll((Collection<? extends String>)newValue);
				return;
			case Cm2Package.DOMAIN_DTO__UPDATE_DATE:
				setUpdateDate((XMLGregorianCalendar)newValue);
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
			case Cm2Package.DOMAIN_DTO__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Cm2Package.DOMAIN_DTO__CONFIG:
				setConfig((DomainConfig)null);
				return;
			case Cm2Package.DOMAIN_DTO__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Cm2Package.DOMAIN_DTO__CT_VERSION_CONVERTER:
				setCtVersionConverter(CT_VERSION_CONVERTER_EDEFAULT);
				return;
			case Cm2Package.DOMAIN_DTO__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)null);
				return;
			case Cm2Package.DOMAIN_DTO__EXTERN_PROPERTIES:
				setExternProperties(EXTERN_PROPERTIES_EDEFAULT);
				return;
			case Cm2Package.DOMAIN_DTO__FINALISED:
				unsetFinalised();
				return;
			case Cm2Package.DOMAIN_DTO__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Cm2Package.DOMAIN_DTO__LOGO:
				setLogo(LOGO_EDEFAULT);
				return;
			case Cm2Package.DOMAIN_DTO__MODULE_VERSION_CONVERTER:
				setModuleVersionConverter(MODULE_VERSION_CONVERTER_EDEFAULT);
				return;
			case Cm2Package.DOMAIN_DTO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Cm2Package.DOMAIN_DTO__POLICY_VERSION_CONVERTER:
				setPolicyVersionConverter(POLICY_VERSION_CONVERTER_EDEFAULT);
				return;
			case Cm2Package.DOMAIN_DTO__SIGNER_ID_TYPES:
				getSignerIdTypes().clear();
				return;
			case Cm2Package.DOMAIN_DTO__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
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
			case Cm2Package.DOMAIN_DTO__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Cm2Package.DOMAIN_DTO__CONFIG:
				return config != null;
			case Cm2Package.DOMAIN_DTO__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case Cm2Package.DOMAIN_DTO__CT_VERSION_CONVERTER:
				return CT_VERSION_CONVERTER_EDEFAULT == null ? ctVersionConverter != null : !CT_VERSION_CONVERTER_EDEFAULT.equals(ctVersionConverter);
			case Cm2Package.DOMAIN_DTO__EXPIRATION_PROPERTIES:
				return expirationProperties != null;
			case Cm2Package.DOMAIN_DTO__EXTERN_PROPERTIES:
				return EXTERN_PROPERTIES_EDEFAULT == null ? externProperties != null : !EXTERN_PROPERTIES_EDEFAULT.equals(externProperties);
			case Cm2Package.DOMAIN_DTO__FINALISED:
				return isSetFinalised();
			case Cm2Package.DOMAIN_DTO__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Cm2Package.DOMAIN_DTO__LOGO:
				return LOGO_EDEFAULT == null ? logo != null : !LOGO_EDEFAULT.equals(logo);
			case Cm2Package.DOMAIN_DTO__MODULE_VERSION_CONVERTER:
				return MODULE_VERSION_CONVERTER_EDEFAULT == null ? moduleVersionConverter != null : !MODULE_VERSION_CONVERTER_EDEFAULT.equals(moduleVersionConverter);
			case Cm2Package.DOMAIN_DTO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Cm2Package.DOMAIN_DTO__POLICY_VERSION_CONVERTER:
				return POLICY_VERSION_CONVERTER_EDEFAULT == null ? policyVersionConverter != null : !POLICY_VERSION_CONVERTER_EDEFAULT.equals(policyVersionConverter);
			case Cm2Package.DOMAIN_DTO__SIGNER_ID_TYPES:
				return signerIdTypes != null && !signerIdTypes.isEmpty();
			case Cm2Package.DOMAIN_DTO__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? updateDate != null : !UPDATE_DATE_EDEFAULT.equals(updateDate);
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
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", ctVersionConverter: ");
		result.append(ctVersionConverter);
		result.append(", externProperties: ");
		result.append(externProperties);
		result.append(", finalised: ");
		if (finalisedESet) result.append(finalised); else result.append("<unset>");
		result.append(", label: ");
		result.append(label);
		result.append(", logo: ");
		result.append(logo);
		result.append(", moduleVersionConverter: ");
		result.append(moduleVersionConverter);
		result.append(", name: ");
		result.append(name);
		result.append(", policyVersionConverter: ");
		result.append(policyVersionConverter);
		result.append(", signerIdTypes: ");
		result.append(signerIdTypes);
		result.append(", updateDate: ");
		result.append(updateDate);
		result.append(')');
		return result.toString();
	}

} //DomainDTOImpl
