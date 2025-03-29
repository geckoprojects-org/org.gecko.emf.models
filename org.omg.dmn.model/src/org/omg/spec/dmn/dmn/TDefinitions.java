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
package org.omg.spec.dmn.dmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.omg.spec.dmn.dmndi.DMNDI;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getDrgElementGroup <em>Drg Element Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getDrgElement <em>Drg Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getElementCollection <em>Element Collection</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getBusinessContextElementGroup <em>Business Context Element Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getBusinessContextElement <em>Business Context Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getDMNDI <em>DMNDI</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getExporter <em>Exporter</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getExporterVersion <em>Exporter Version</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDefinitions#getTypeLanguage <em>Type Language</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions()
 * @model extendedMetaData="name='tDefinitions' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TDefinitions extends TNamedElement {
	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_Import()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TImport> getImport();

	/**
	 * Returns the value of the '<em><b>Item Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TItemDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Definition</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_ItemDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TItemDefinition> getItemDefinition();

	/**
	 * Returns the value of the '<em><b>Drg Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drg Element Group</em>' attribute list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_DrgElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='drgElement:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDrgElementGroup();

	/**
	 * Returns the value of the '<em><b>Drg Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDRGElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drg Element</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_DrgElement()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='drgElement' namespace='##targetNamespace' group='drgElement:group'"
	 * @generated
	 */
	EList<TDRGElement> getDrgElement();

	/**
	 * Returns the value of the '<em><b>Artifact Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Group</em>' attribute list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_ArtifactGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='artifact:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getArtifactGroup();

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_Artifact()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace' group='artifact:group'"
	 * @generated
	 */
	EList<TArtifact> getArtifact();

	/**
	 * Returns the value of the '<em><b>Element Collection</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TElementCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Collection</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_ElementCollection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='elementCollection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TElementCollection> getElementCollection();

	/**
	 * Returns the value of the '<em><b>Business Context Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Context Element Group</em>' attribute list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_BusinessContextElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='businessContextElement:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBusinessContextElementGroup();

	/**
	 * Returns the value of the '<em><b>Business Context Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TBusinessContextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Context Element</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_BusinessContextElement()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='businessContextElement' namespace='##targetNamespace' group='businessContextElement:group'"
	 * @generated
	 */
	EList<TBusinessContextElement> getBusinessContextElement();

	/**
	 * Returns the value of the '<em><b>DMNDI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMNDI</em>' containment reference.
	 * @see #setDMNDI(DMNDI)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_DMNDI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DMNDI' namespace='https://www.omg.org/spec/DMN/20230324/DMNDI/'"
	 * @generated
	 */
	DMNDI getDMNDI();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDefinitions#getDMNDI <em>DMNDI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMNDI</em>' containment reference.
	 * @see #getDMNDI()
	 * @generated
	 */
	void setDMNDI(DMNDI value);

	/**
	 * Returns the value of the '<em><b>Exporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporter</em>' attribute.
	 * @see #setExporter(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_Exporter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exporter'"
	 * @generated
	 */
	String getExporter();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDefinitions#getExporter <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter</em>' attribute.
	 * @see #getExporter()
	 * @generated
	 */
	void setExporter(String value);

	/**
	 * Returns the value of the '<em><b>Exporter Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporter Version</em>' attribute.
	 * @see #setExporterVersion(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_ExporterVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exporterVersion'"
	 * @generated
	 */
	String getExporterVersion();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDefinitions#getExporterVersion <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter Version</em>' attribute.
	 * @see #getExporterVersion()
	 * @generated
	 */
	void setExporterVersion(String value);

	/**
	 * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
	 * The default value is <code>"https://www.omg.org/spec/DMN/20240513/FEEL/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Language</em>' attribute.
	 * @see #isSetExpressionLanguage()
	 * @see #unsetExpressionLanguage()
	 * @see #setExpressionLanguage(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_ExpressionLanguage()
	 * @model default="https://www.omg.org/spec/DMN/20240513/FEEL/" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='expressionLanguage'"
	 * @generated
	 */
	String getExpressionLanguage();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDefinitions#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Language</em>' attribute.
	 * @see #isSetExpressionLanguage()
	 * @see #unsetExpressionLanguage()
	 * @see #getExpressionLanguage()
	 * @generated
	 */
	void setExpressionLanguage(String value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmn.TDefinitions#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpressionLanguage()
	 * @see #getExpressionLanguage()
	 * @see #setExpressionLanguage(String)
	 * @generated
	 */
	void unsetExpressionLanguage();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmn.TDefinitions#getExpressionLanguage <em>Expression Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expression Language</em>' attribute is set.
	 * @see #unsetExpressionLanguage()
	 * @see #getExpressionLanguage()
	 * @see #setExpressionLanguage(String)
	 * @generated
	 */
	boolean isSetExpressionLanguage();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_Namespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDefinitions#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Type Language</b></em>' attribute.
	 * The default value is <code>"https://www.omg.org/spec/DMN/20240513/FEEL/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Language</em>' attribute.
	 * @see #isSetTypeLanguage()
	 * @see #unsetTypeLanguage()
	 * @see #setTypeLanguage(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDefinitions_TypeLanguage()
	 * @model default="https://www.omg.org/spec/DMN/20240513/FEEL/" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='typeLanguage'"
	 * @generated
	 */
	String getTypeLanguage();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDefinitions#getTypeLanguage <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Language</em>' attribute.
	 * @see #isSetTypeLanguage()
	 * @see #unsetTypeLanguage()
	 * @see #getTypeLanguage()
	 * @generated
	 */
	void setTypeLanguage(String value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmn.TDefinitions#getTypeLanguage <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeLanguage()
	 * @see #getTypeLanguage()
	 * @see #setTypeLanguage(String)
	 * @generated
	 */
	void unsetTypeLanguage();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmn.TDefinitions#getTypeLanguage <em>Type Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Language</em>' attribute is set.
	 * @see #unsetTypeLanguage()
	 * @see #getTypeLanguage()
	 * @see #setTypeLanguage(String)
	 * @generated
	 */
	boolean isSetTypeLanguage();

} // TDefinitions
