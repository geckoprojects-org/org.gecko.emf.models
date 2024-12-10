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
package ee.jakarta.xml.ns.persistence.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Entity Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Repeatable(NamedEntityGraphs.class)
 *         @Target({TYPE}) @Retention(RUNTIME)
 *         public @interface NamedEntityGraph {
 *           String name() default "";
 *           NamedAttributeNode[] attributeNodes() default {};
 *           boolean includeAllAttributes() default false;
 *           NamedSubgraph[] subgraphs() default {};
 *           NamedSubGraph[] subclassSubgraphs() default {};
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getNamedAttributeNode <em>Named Attribute Node</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getSubclassSubgraph <em>Subclass Subgraph</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#isIncludeAllAttributes <em>Include All Attributes</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedEntityGraph()
 * @model extendedMetaData="name='named-entity-graph' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NamedEntityGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Named Attribute Node</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.NamedAttributeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Attribute Node</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedEntityGraph_NamedAttributeNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='named-attribute-node' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NamedAttributeNode> getNamedAttributeNode();

	/**
	 * Returns the value of the '<em><b>Subgraph</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgraph</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedEntityGraph_Subgraph()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subgraph' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NamedSubgraph> getSubgraph();

	/**
	 * Returns the value of the '<em><b>Subclass Subgraph</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass Subgraph</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedEntityGraph_SubclassSubgraph()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subclass-subgraph' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NamedSubgraph> getSubclassSubgraph();

	/**
	 * Returns the value of the '<em><b>Include All Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include All Attributes</em>' attribute.
	 * @see #isSetIncludeAllAttributes()
	 * @see #unsetIncludeAllAttributes()
	 * @see #setIncludeAllAttributes(boolean)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedEntityGraph_IncludeAllAttributes()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='include-all-attributes'"
	 * @generated
	 */
	boolean isIncludeAllAttributes();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#isIncludeAllAttributes <em>Include All Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include All Attributes</em>' attribute.
	 * @see #isSetIncludeAllAttributes()
	 * @see #unsetIncludeAllAttributes()
	 * @see #isIncludeAllAttributes()
	 * @generated
	 */
	void setIncludeAllAttributes(boolean value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#isIncludeAllAttributes <em>Include All Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeAllAttributes()
	 * @see #isIncludeAllAttributes()
	 * @see #setIncludeAllAttributes(boolean)
	 * @generated
	 */
	void unsetIncludeAllAttributes();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#isIncludeAllAttributes <em>Include All Attributes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include All Attributes</em>' attribute is set.
	 * @see #unsetIncludeAllAttributes()
	 * @see #isIncludeAllAttributes()
	 * @see #setIncludeAllAttributes(boolean)
	 * @generated
	 */
	boolean isSetIncludeAllAttributes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedEntityGraph_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedEntityGraph
