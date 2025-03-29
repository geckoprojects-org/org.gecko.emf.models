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
package org.omg.spec.cmmn.casemodel.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TArtifact;
import org.omg.spec.cmmn.casemodel.TCase;
import org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition;
import org.omg.spec.cmmn.casemodel.TDecision;
import org.omg.spec.cmmn.casemodel.TDefinitions;
import org.omg.spec.cmmn.casemodel.TExtensionElements;
import org.omg.spec.cmmn.casemodel.TImport;
import org.omg.spec.cmmn.casemodel.TProcess;
import org.omg.spec.cmmn.casemodel.TRelationship;

import org.omg.spec.cmmn.cmmndi.CMMNDI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getCaseFileItemDefinition <em>Case File Item Definition</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getCase <em>Case</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getExtensionElements <em>Extension Elements</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getCMMNDI <em>CMMNDI</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getExporter <em>Exporter</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getExporterVersion <em>Exporter Version</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDefinitionsImpl extends MinimalEObjectImpl.Container implements TDefinitions {
	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<TImport> import_;

	/**
	 * The cached value of the '{@link #getCaseFileItemDefinition() <em>Case File Item Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseFileItemDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TCaseFileItemDefinition> caseFileItemDefinition;

	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected EList<TCase> case_;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<TProcess> process;

	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<TDecision> decision;

	/**
	 * The cached value of the '{@link #getExtensionElements() <em>Extension Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionElements()
	 * @generated
	 * @ordered
	 */
	protected TExtensionElements extensionElements;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<TRelationship> relationship;

	/**
	 * The cached value of the '{@link #getArtifactGroup() <em>Artifact Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap artifactGroup;

	/**
	 * The cached value of the '{@link #getCMMNDI() <em>CMMNDI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMMNDI()
	 * @generated
	 * @ordered
	 */
	protected CMMNDI cMMNDI;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

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
	 * The default value of the '{@link #getExporter() <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExporter() <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter()
	 * @generated
	 * @ordered
	 */
	protected String exporter = EXPORTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExporterVersion() <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTER_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExporterVersion() <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion()
	 * @generated
	 * @ordered
	 */
	protected String exporterVersion = EXPORTER_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "http://www.w3.org/1999/XPath";

	/**
	 * The cached value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected String expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Expression Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expressionLanguageESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TDEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TImport> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<TImport>(TImport.class, this, CaseModelPackage.TDEFINITIONS__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCaseFileItemDefinition> getCaseFileItemDefinition() {
		if (caseFileItemDefinition == null) {
			caseFileItemDefinition = new EObjectContainmentEList<TCaseFileItemDefinition>(TCaseFileItemDefinition.class, this, CaseModelPackage.TDEFINITIONS__CASE_FILE_ITEM_DEFINITION);
		}
		return caseFileItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCase> getCase() {
		if (case_ == null) {
			case_ = new EObjectContainmentEList<TCase>(TCase.class, this, CaseModelPackage.TDEFINITIONS__CASE);
		}
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TProcess> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<TProcess>(TProcess.class, this, CaseModelPackage.TDEFINITIONS__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDecision> getDecision() {
		if (decision == null) {
			decision = new EObjectContainmentEList<TDecision>(TDecision.class, this, CaseModelPackage.TDEFINITIONS__DECISION);
		}
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExtensionElements getExtensionElements() {
		return extensionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionElements(TExtensionElements newExtensionElements, NotificationChain msgs) {
		TExtensionElements oldExtensionElements = extensionElements;
		extensionElements = newExtensionElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__EXTENSION_ELEMENTS, oldExtensionElements, newExtensionElements);
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
	public void setExtensionElements(TExtensionElements newExtensionElements) {
		if (newExtensionElements != extensionElements) {
			NotificationChain msgs = null;
			if (extensionElements != null)
				msgs = ((InternalEObject)extensionElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TDEFINITIONS__EXTENSION_ELEMENTS, null, msgs);
			if (newExtensionElements != null)
				msgs = ((InternalEObject)newExtensionElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TDEFINITIONS__EXTENSION_ELEMENTS, null, msgs);
			msgs = basicSetExtensionElements(newExtensionElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__EXTENSION_ELEMENTS, newExtensionElements, newExtensionElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TRelationship> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<TRelationship>(TRelationship.class, this, CaseModelPackage.TDEFINITIONS__RELATIONSHIP);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getArtifactGroup() {
		if (artifactGroup == null) {
			artifactGroup = new BasicFeatureMap(this, CaseModelPackage.TDEFINITIONS__ARTIFACT_GROUP);
		}
		return artifactGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TArtifact> getArtifact() {
		return getArtifactGroup().list(CaseModelPackage.Literals.TDEFINITIONS__ARTIFACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNDI getCMMNDI() {
		return cMMNDI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCMMNDI(CMMNDI newCMMNDI, NotificationChain msgs) {
		CMMNDI oldCMMNDI = cMMNDI;
		cMMNDI = newCMMNDI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__CMMNDI, oldCMMNDI, newCMMNDI);
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
	public void setCMMNDI(CMMNDI newCMMNDI) {
		if (newCMMNDI != cMMNDI) {
			NotificationChain msgs = null;
			if (cMMNDI != null)
				msgs = ((InternalEObject)cMMNDI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TDEFINITIONS__CMMNDI, null, msgs);
			if (newCMMNDI != null)
				msgs = ((InternalEObject)newCMMNDI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TDEFINITIONS__CMMNDI, null, msgs);
			msgs = basicSetCMMNDI(newCMMNDI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__CMMNDI, newCMMNDI, newCMMNDI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__AUTHOR, oldAuthor, author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExporter() {
		return exporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExporter(String newExporter) {
		String oldExporter = exporter;
		exporter = newExporter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__EXPORTER, oldExporter, exporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExporterVersion() {
		return exporterVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExporterVersion(String newExporterVersion) {
		String oldExporterVersion = exporterVersion;
		exporterVersion = newExporterVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__EXPORTER_VERSION, oldExporterVersion, exporterVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpressionLanguage() {
		return expressionLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionLanguage(String newExpressionLanguage) {
		String oldExpressionLanguage = expressionLanguage;
		expressionLanguage = newExpressionLanguage;
		boolean oldExpressionLanguageESet = expressionLanguageESet;
		expressionLanguageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__EXPRESSION_LANGUAGE, oldExpressionLanguage, expressionLanguage, !oldExpressionLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExpressionLanguage() {
		String oldExpressionLanguage = expressionLanguage;
		boolean oldExpressionLanguageESet = expressionLanguageESet;
		expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;
		expressionLanguageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CaseModelPackage.TDEFINITIONS__EXPRESSION_LANGUAGE, oldExpressionLanguage, EXPRESSION_LANGUAGE_EDEFAULT, oldExpressionLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExpressionLanguage() {
		return expressionLanguageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDEFINITIONS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, CaseModelPackage.TDEFINITIONS__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TDEFINITIONS__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TDEFINITIONS__CASE_FILE_ITEM_DEFINITION:
				return ((InternalEList<?>)getCaseFileItemDefinition()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TDEFINITIONS__CASE:
				return ((InternalEList<?>)getCase()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TDEFINITIONS__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TDEFINITIONS__DECISION:
				return ((InternalEList<?>)getDecision()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TDEFINITIONS__EXTENSION_ELEMENTS:
				return basicSetExtensionElements(null, msgs);
			case CaseModelPackage.TDEFINITIONS__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TDEFINITIONS__ARTIFACT_GROUP:
				return ((InternalEList<?>)getArtifactGroup()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TDEFINITIONS__ARTIFACT:
				return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TDEFINITIONS__CMMNDI:
				return basicSetCMMNDI(null, msgs);
			case CaseModelPackage.TDEFINITIONS__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case CaseModelPackage.TDEFINITIONS__IMPORT:
				return getImport();
			case CaseModelPackage.TDEFINITIONS__CASE_FILE_ITEM_DEFINITION:
				return getCaseFileItemDefinition();
			case CaseModelPackage.TDEFINITIONS__CASE:
				return getCase();
			case CaseModelPackage.TDEFINITIONS__PROCESS:
				return getProcess();
			case CaseModelPackage.TDEFINITIONS__DECISION:
				return getDecision();
			case CaseModelPackage.TDEFINITIONS__EXTENSION_ELEMENTS:
				return getExtensionElements();
			case CaseModelPackage.TDEFINITIONS__RELATIONSHIP:
				return getRelationship();
			case CaseModelPackage.TDEFINITIONS__ARTIFACT_GROUP:
				if (coreType) return getArtifactGroup();
				return ((FeatureMap.Internal)getArtifactGroup()).getWrapper();
			case CaseModelPackage.TDEFINITIONS__ARTIFACT:
				return getArtifact();
			case CaseModelPackage.TDEFINITIONS__CMMNDI:
				return getCMMNDI();
			case CaseModelPackage.TDEFINITIONS__AUTHOR:
				return getAuthor();
			case CaseModelPackage.TDEFINITIONS__CREATION_DATE:
				return getCreationDate();
			case CaseModelPackage.TDEFINITIONS__EXPORTER:
				return getExporter();
			case CaseModelPackage.TDEFINITIONS__EXPORTER_VERSION:
				return getExporterVersion();
			case CaseModelPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				return getExpressionLanguage();
			case CaseModelPackage.TDEFINITIONS__ID:
				return getId();
			case CaseModelPackage.TDEFINITIONS__NAME:
				return getName();
			case CaseModelPackage.TDEFINITIONS__TARGET_NAMESPACE:
				return getTargetNamespace();
			case CaseModelPackage.TDEFINITIONS__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case CaseModelPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends TImport>)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__CASE_FILE_ITEM_DEFINITION:
				getCaseFileItemDefinition().clear();
				getCaseFileItemDefinition().addAll((Collection<? extends TCaseFileItemDefinition>)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__CASE:
				getCase().clear();
				getCase().addAll((Collection<? extends TCase>)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends TProcess>)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__DECISION:
				getDecision().clear();
				getDecision().addAll((Collection<? extends TDecision>)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends TRelationship>)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__ARTIFACT_GROUP:
				((FeatureMap.Internal)getArtifactGroup()).set(newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__ARTIFACT:
				getArtifact().clear();
				getArtifact().addAll((Collection<? extends TArtifact>)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__CMMNDI:
				setCMMNDI((CMMNDI)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__AUTHOR:
				setAuthor((String)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__EXPORTER:
				setExporter((String)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__EXPORTER_VERSION:
				setExporterVersion((String)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				setExpressionLanguage((String)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__ID:
				setId((String)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__NAME:
				setName((String)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case CaseModelPackage.TDEFINITIONS__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case CaseModelPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				return;
			case CaseModelPackage.TDEFINITIONS__CASE_FILE_ITEM_DEFINITION:
				getCaseFileItemDefinition().clear();
				return;
			case CaseModelPackage.TDEFINITIONS__CASE:
				getCase().clear();
				return;
			case CaseModelPackage.TDEFINITIONS__PROCESS:
				getProcess().clear();
				return;
			case CaseModelPackage.TDEFINITIONS__DECISION:
				getDecision().clear();
				return;
			case CaseModelPackage.TDEFINITIONS__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)null);
				return;
			case CaseModelPackage.TDEFINITIONS__RELATIONSHIP:
				getRelationship().clear();
				return;
			case CaseModelPackage.TDEFINITIONS__ARTIFACT_GROUP:
				getArtifactGroup().clear();
				return;
			case CaseModelPackage.TDEFINITIONS__ARTIFACT:
				getArtifact().clear();
				return;
			case CaseModelPackage.TDEFINITIONS__CMMNDI:
				setCMMNDI((CMMNDI)null);
				return;
			case CaseModelPackage.TDEFINITIONS__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CaseModelPackage.TDEFINITIONS__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case CaseModelPackage.TDEFINITIONS__EXPORTER:
				setExporter(EXPORTER_EDEFAULT);
				return;
			case CaseModelPackage.TDEFINITIONS__EXPORTER_VERSION:
				setExporterVersion(EXPORTER_VERSION_EDEFAULT);
				return;
			case CaseModelPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				unsetExpressionLanguage();
				return;
			case CaseModelPackage.TDEFINITIONS__ID:
				setId(ID_EDEFAULT);
				return;
			case CaseModelPackage.TDEFINITIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CaseModelPackage.TDEFINITIONS__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case CaseModelPackage.TDEFINITIONS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case CaseModelPackage.TDEFINITIONS__IMPORT:
				return import_ != null && !import_.isEmpty();
			case CaseModelPackage.TDEFINITIONS__CASE_FILE_ITEM_DEFINITION:
				return caseFileItemDefinition != null && !caseFileItemDefinition.isEmpty();
			case CaseModelPackage.TDEFINITIONS__CASE:
				return case_ != null && !case_.isEmpty();
			case CaseModelPackage.TDEFINITIONS__PROCESS:
				return process != null && !process.isEmpty();
			case CaseModelPackage.TDEFINITIONS__DECISION:
				return decision != null && !decision.isEmpty();
			case CaseModelPackage.TDEFINITIONS__EXTENSION_ELEMENTS:
				return extensionElements != null;
			case CaseModelPackage.TDEFINITIONS__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case CaseModelPackage.TDEFINITIONS__ARTIFACT_GROUP:
				return artifactGroup != null && !artifactGroup.isEmpty();
			case CaseModelPackage.TDEFINITIONS__ARTIFACT:
				return !getArtifact().isEmpty();
			case CaseModelPackage.TDEFINITIONS__CMMNDI:
				return cMMNDI != null;
			case CaseModelPackage.TDEFINITIONS__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CaseModelPackage.TDEFINITIONS__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case CaseModelPackage.TDEFINITIONS__EXPORTER:
				return EXPORTER_EDEFAULT == null ? exporter != null : !EXPORTER_EDEFAULT.equals(exporter);
			case CaseModelPackage.TDEFINITIONS__EXPORTER_VERSION:
				return EXPORTER_VERSION_EDEFAULT == null ? exporterVersion != null : !EXPORTER_VERSION_EDEFAULT.equals(exporterVersion);
			case CaseModelPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				return isSetExpressionLanguage();
			case CaseModelPackage.TDEFINITIONS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CaseModelPackage.TDEFINITIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CaseModelPackage.TDEFINITIONS__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case CaseModelPackage.TDEFINITIONS__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (artifactGroup: ");
		result.append(artifactGroup);
		result.append(", author: ");
		result.append(author);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", exporter: ");
		result.append(exporter);
		result.append(", exporterVersion: ");
		result.append(exporterVersion);
		result.append(", expressionLanguage: ");
		if (expressionLanguageESet) result.append(expressionLanguage); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TDefinitionsImpl
